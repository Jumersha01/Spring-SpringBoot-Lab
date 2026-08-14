package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestProj09WheatherConsumerApplication {

	@Bean
	public RestTemplate getTemplate() {
		System.out.println("RestProj09WheatherConsumerApplication.getTemplate()");
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(RestProj09WheatherConsumerApplication.class, args);
	}

}
