package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WheatherConsumerController {
	@Autowired
	private RestTemplate template;

	@GetMapping("/weather-check")
	public String getWheatherInfo() {
		String path = "http://localhost:8080/RestProj_09_Wheather_Producer/weather/alert";
		String result = template.getForObject(path, String.class);
		return result;
	}
}
