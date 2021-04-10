package com.ps.weatherforecast;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableWebMvc
public class SwaggerConfig {

	public SwaggerConfig() {
		// TODO Auto-generated constructor stub
	}

	@Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2)
	    		  //.select.apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();  
	         .select().apis(RequestHandlerSelectors.basePackage("com.ps.weatherforecast.controller")).build();
	   }
}
