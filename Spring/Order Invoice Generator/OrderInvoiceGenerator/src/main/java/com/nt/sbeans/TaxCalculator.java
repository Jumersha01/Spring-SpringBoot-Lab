package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("tc")
public class TaxCalculator {

	public double calculateTAx(double amount) {
		return (amount*0.18);
	}
	
}
