package com.ps.weatherforecast.dto;

public class TempRequest {

	private String id;
	private String countryName;
	private String alpha2;
	private String alpha3;
	private String apiKey;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getAlpha2() {
		return alpha2;
	}
	public void setAlpha2(String alpha2) {
		this.alpha2 = alpha2;
	}
	public String getAlpha3() {
		return alpha3;
	}
	public void setAlpha3(String alpha3) {
		this.alpha3 = alpha3;
	}
		
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	@Override
	public String toString() {
		return "TempRequest [id=" + id + ", countryName=" + countryName + ", alpha2=" + alpha2 + ", alpha3=" + alpha3
				+ "]";
	}
	
}
