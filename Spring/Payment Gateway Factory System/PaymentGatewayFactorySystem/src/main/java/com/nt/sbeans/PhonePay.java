package com.nt.sbeans;

import org.springframework.stereotype.Component;

import com.nt.comp.PaymentService;

@Component
public class PhonePay implements PaymentService {

	private String gateWayName;
	private double transactionCharge;
	@Override
	public void processPayment() {
		
	System.out.println("Payment Processed throgh phonePay:");

	}

	@Override
	public void showGateWayInfo() {
		System.out.println("GateWayName: "+this.gateWayName+"\nTransaction Charge: "+this.transactionCharge);
	

	}

}
