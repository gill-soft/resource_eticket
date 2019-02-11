package com.gillsoft;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

import com.gillsoft.abstract_rest_service.AbstractLocalityService;
import com.gillsoft.model.Locality;
import com.gillsoft.model.request.LocalityRequest;

@RestController
public class LocalityServiceController extends AbstractLocalityService {

	@Override
	public List<Locality> getAllResponse(LocalityRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Locality> getUsedResponse(LocalityRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, List<String>> getBindingResponse(LocalityRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
