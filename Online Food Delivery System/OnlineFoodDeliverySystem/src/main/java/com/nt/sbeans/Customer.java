package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cust")
public class Customer {

	@Value("101")
	private int customerId;
	
	@Value("Junaid")
	private String customerName;

	@Autowired
	public DeliveryService service;
	
	public void placeOrder() {
		System.out.println("Customer name: "+this.customerName+" Customer id: "+this.customerId);
		service.dilieverOder();
	}
	

}
