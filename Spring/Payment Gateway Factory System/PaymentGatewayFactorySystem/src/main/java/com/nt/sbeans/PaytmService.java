package com.nt.sbeans;

import org.springframework.stereotype.Component;

import com.nt.comp.PaymentService;
@Component
public class PaytmService implements PaymentService {

	private String gateWayName;
	private double walletLimit;
	@Override
	public void processPayment() {
		
	System.out.println("Payment Processed throgh Paytm:");

	}

	@Override
	public void showGateWayInfo() {
		System.out.println("GateWayName: "+this.gateWayName+"\nWallet limit: "+this.walletLimit);
	

	}
}
