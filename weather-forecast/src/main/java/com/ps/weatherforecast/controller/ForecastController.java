package com.ps.weatherforecast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ps.weatherforecast.dto.TempRequest;
import com.ps.weatherforecast.dto.TempResponse;
import com.ps.weatherforecast.service.api.ForecastService;

@RestController
public class ForecastController {
	
	@Autowired
	ForecastService forecastService;

	@GetMapping(value = "/tempForecast", produces=MediaType.APPLICATION_JSON_VALUE)  
	@ResponseBody
	//@ApiOperation(value="Get three days temperature forecast details")
	public TempResponse getTemperatureForecasts(@RequestBody TempRequest tempRequest)  
	{  
		TempResponse tempResponse = forecastService.getTemperatureForecasts(tempRequest);
		
		System.out.println(tempResponse.toString());
		return tempResponse;  
	}  
}
