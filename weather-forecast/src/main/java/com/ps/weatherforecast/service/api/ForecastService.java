package com.ps.weatherforecast.service.api;

import com.ps.weatherforecast.dto.TempRequest;
import com.ps.weatherforecast.dto.TempResponse;

public interface ForecastService {

	TempResponse getTemperatureForecasts(TempRequest tempRequest);
}
