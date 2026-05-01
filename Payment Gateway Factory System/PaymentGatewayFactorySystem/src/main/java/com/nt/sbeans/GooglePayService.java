package com.nt.sbeans;

import org.springframework.stereotype.Component;

import com.nt.comp.PaymentService;

@Component
public class GooglePayService implements PaymentService {

	private String gateWayName;
	private double cashBackOffer;
	@Override
	public void processPayment() {
		
	System.out.println("Payment Processed throgh GooglePay:");

	}

	@Override
	public void showGateWayInfo() {
		System.out.println("GateWayName: "+this.gateWayName+"\nCash back Offer: "+this.cashBackOffer);
	

	}
}
