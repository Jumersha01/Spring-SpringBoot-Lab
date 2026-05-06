package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("ptm")
public class PaytmPaymentService implements PaymentService{
	@Override
	public void pay(double amount) {
		System.out.println( amount+" Paid using paytm");
	}

}
