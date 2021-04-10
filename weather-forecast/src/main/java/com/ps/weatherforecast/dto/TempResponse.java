package com.ps.weatherforecast.dto;

import java.math.BigDecimal;
import java.util.List;

public class TempResponse {

	private int cnt;
	private List<DaywiseForecast> daywiseForecast;
	private City city;
	
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public List<DaywiseForecast> getDaywiseForecast() {
		return daywiseForecast;
	}
	public void setDaywiseForecast(List<DaywiseForecast> daywiseForecast) {
		this.daywiseForecast = daywiseForecast;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
		
}

class DaywiseForecast {

	private String dt_txt;
	private TempDetail tempDetail;
	private Weather weather;
	
	class TempDetail {
		private BigDecimal temp;

		public BigDecimal getTemp() {
			return temp;
		}

		public void setTemp(BigDecimal temp) {
			this.temp = temp;
		}
		
	}
	
	class Weather {
		private String type;
		private String description;
		
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}

	public String getDt_txt() {
		return dt_txt;
	}

	public void setDt_txt(String dt_txt) {
		this.dt_txt = dt_txt;
	}

	public TempDetail getTempDetail() {
		return tempDetail;
	}

	public void setTempDetail(TempDetail tempDetail) {
		this.tempDetail = tempDetail;
	}

	public Weather getWeather() {
		return weather;
	}

	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	
	
	
}

class City{
	
	private int id;
	private String name;
	private String country;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}