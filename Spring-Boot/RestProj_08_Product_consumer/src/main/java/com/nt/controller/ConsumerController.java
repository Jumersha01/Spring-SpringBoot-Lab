package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	
	@Autowired
    private RestTemplate template;
	
	@GetMapping("/info")
	public String consumProduct() {
		String url = "http://localhost:8080/RestProj_08_Product_Producer/courier/status";
		String result = template.getForObject(url, String.class);
		return result;
		
	}
}
