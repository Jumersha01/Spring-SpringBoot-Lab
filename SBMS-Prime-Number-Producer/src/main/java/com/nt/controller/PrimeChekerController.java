package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PrimeChekerController {
	
	@GetMapping("/check/{number}")
	public String getMethodName(@PathVariable Integer number) {

		int count = 0;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				count++;
			}
		}

		if (count == 0) {
			return "Number is Prime : " + number;
		} else
			return "Number is not Prime : " + number;
	}
	

}
