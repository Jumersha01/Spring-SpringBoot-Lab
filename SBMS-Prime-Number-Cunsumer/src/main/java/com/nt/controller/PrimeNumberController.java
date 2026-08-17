package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.PrimeNumberClient;

@RestController
public class PrimeNumberController {
	
	@Autowired
	PrimeNumberClient client;

	@GetMapping("/check/{number}")
	public String getMethodName(@PathVariable Integer number) {
		String string = client.getMethodName(number);
		return string;
	}

}
