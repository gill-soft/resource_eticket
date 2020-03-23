package com.gillsoft.client;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.datetime.FastDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.gillsoft.cache.CacheHandler;
import com.gillsoft.cache.IOCacheException;
import com.gillsoft.cache.RedisMemoryCache;
import com.gillsoft.model.Lang;
import com.gillsoft.model.ResponseError;
import com.gillsoft.util.RestTemplateUtil;
import com.gillsoft.util.StringUtil;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class RestClient {
	
	private static Logger LOGGER = LogManager.getLogger(RestClient.class);
	
	public static final String STATIONS_CACHE_KEY = "eticket.stations";
	
	public static final FastDateFormat dateTimeFormat = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
	
	@Autowired
    @Qualifier("RedisMemoryCache")
	private CacheHandler cache;
	
	private RestTemplate template;
	
	// для запросов поиска с меньшим таймаутом
	private RestTemplate searchTemplate;
	
	public RestClient() {
		template = createNewPoolingTemplate(Config.getRequestTimeout());
		searchTemplate = createNewPoolingTemplate(Config.getSearchRequestTimeout());
	}
	
	public RestTemplate createNewPoolingTemplate(int requestTimeout) {
		RestTemplate template = new RestTemplate(new BufferingClientHttpRequestFactory(
				RestTemplateUtil.createPoolingFactory(Config.getUrl(), 300, requestTimeout)));
		template.setMessageConverters(RestTemplateUtil.getMarshallingMessageConverters(Request.class, Response.class));
		template.setInterceptors(Collections.singletonList(
				new SignRequestResponseInterceptor()));
		return template;
	}
	
	@SuppressWarnings("unchecked")
	public List<CountryType> getCachedCountries() throws IOCacheException {
		Map<String, Object> params = new HashMap<>();
		params.put(RedisMemoryCache.OBJECT_NAME, RestClient.STATIONS_CACHE_KEY);
		params.put(RedisMemoryCache.IGNORE_AGE, true);
		params.put(RedisMemoryCache.UPDATE_DELAY, Config.getCacheStationsUpdateDelay());
		params.put(RedisMemoryCache.UPDATE_TASK, new StationsUpdateTask());
		return (List<CountryType>) cache.read(params);
	}
	
	public List<CountryType> getCountries() throws ResponseError {
		Request request = createRequest(null, "stations list");
		Response response = sendRequest(request);
		return response.getTransaction().getCountry();
	}
	
	private Response sendRequest(Request request) throws ResponseError {
		try {
			ResponseEntity<Response> responseEntity = template.postForEntity(Config.getUrl(), request, Response.class);
			Response response = responseEntity.getBody();
			ErrorType error = response.getError();
			if (error != null) {
				LOGGER.error("Response error: " + error.getCode());
				throw new ResponseError(error.getText());
			} else {
				return response;
			}
		} catch (RestClientException e) {
			LOGGER.error("Request send error", e);
			throw new ResponseError(e.getMessage());
		}
	}
	
	private Request createRequest(Lang lang, String transactionType) {
		Request request = new Request();
		request.setMerchantId(Config.getMerchantId());
		request.setDatetime(dateTimeFormat.format(new Date()));
		request.setProductId(10000);
		request.setVersion("1.0");
		request.setLanguage(getLanguage(lang).name());
		request.setXmlsign("_");
		Request.Transaction transaction = new Request.Transaction();
		transaction.setId(StringUtil.generateUUID());
		transaction.setType(transactionType);
		request.setTransaction(transaction);
		return request;
	}
	
	private Language getLanguage(Lang lang) {
		if (lang == null) {
			return Language.LT;
		}
		switch (lang) {
		case RU:
			return Language.RU;
		case UA:
			return Language.UK;
		case EN:
			return Language.LT;
		default:
			return Language.LT;
		}
	}
	
	public CacheHandler getCache() {
		return cache;
	}
	
	public static void main(String[] args) throws ResponseError {
		RestClient client = new RestClient();
		client.getCountries();
	}

}
