package com.nt.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class BankController {
	
	@GetMapping("/")
	public String home() {
		return "Wellcome to AV Bank";
	}
	
	@GetMapping("/balance")
	public String balance() {
		return "Your Balance is: 50";
	}
	
	@GetMapping("/loan/{id}")
	public String loan(@PathVariable int id) {
		return "Personal Loan Service is Available"+id;
	}

}
