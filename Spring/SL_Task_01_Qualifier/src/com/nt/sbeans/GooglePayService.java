package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("gp")
public class GooglePayService implements PaymentService {

	@Override
	public void pay(double amount) {
		System.out.println( amount+" Paid using Google Pay");
	}
}
