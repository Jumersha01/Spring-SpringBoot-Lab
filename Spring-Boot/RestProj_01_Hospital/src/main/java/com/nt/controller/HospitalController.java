package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
   
	@GetMapping("/")
	public String home() {
		return "Wellcome to city Hospital";
	}
	
	@GetMapping("/doctor")
	public String getDoctor() {
		return "Doctor Available : Dr.Kumar Verma";
	}
	
	@GetMapping("/emergency")
	public String emergencey() {
		return "Emergency service available for 24/7";
	}
	
}
