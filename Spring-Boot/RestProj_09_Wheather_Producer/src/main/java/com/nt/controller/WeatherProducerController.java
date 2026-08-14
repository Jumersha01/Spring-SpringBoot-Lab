package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherProducerController {
	
  @GetMapping("/weather/alert")
  public String getDetails() {
	  return "Heavy reain is expected";
  }
  
}
