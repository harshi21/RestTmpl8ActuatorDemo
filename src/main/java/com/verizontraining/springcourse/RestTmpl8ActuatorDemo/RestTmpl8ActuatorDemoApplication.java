package com.verizontraining.springcourse.RestTmpl8ActuatorDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTmpl8ActuatorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTmpl8ActuatorDemoApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
