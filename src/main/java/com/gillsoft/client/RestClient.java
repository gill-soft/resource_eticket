package com.gillsoft.client;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.gillsoft.cache.CacheHandler;
import com.gillsoft.logging.SimpleRequestResponseLoggingInterceptor;
import com.gillsoft.util.RestTemplateUtil;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class RestClient {
	
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
		template.setMessageConverters(RestTemplateUtil.getMarshallingMessageConverters(Request.class));//TODO response classes
		template.setInterceptors(Collections.singletonList(
				new SimpleRequestResponseLoggingInterceptor()));
		return template;
	}

}
