package com.ps.weatherforecast.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.ps.weatherforecast.dto.TempRequest;
import com.ps.weatherforecast.dto.TempResponse;
import com.ps.weatherforecast.service.api.ForecastService;

@Service
public class ForecastServiceImpl implements ForecastService{

	RestTemplate restTemplate;
	
	public ForecastServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	String httpUrl = "api.openweathermap.org/data/2.5/forecast";
	//?q={city name}&appid={API key}
	
	@Override
	public TempResponse getTemperatureForecasts(TempRequest tempRequest) {
		
		UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(httpUrl).queryParam("q", tempRequest.getCountryName()).queryParam("appid", tempRequest.getApiKey()).build();
		
		HttpHeaders httpHeaders = new HttpHeaders();
		Object request = tempRequest;
		
		HttpEntity<Object> httpEntity = new HttpEntity<>(request, httpHeaders);
		
		ResponseEntity<TempResponse> responseEntity = restTemplate.exchange(uriComponents.toUri(), HttpMethod.GET, httpEntity, TempResponse.class);

		return responseEntity.getBody();
	}

	
}
