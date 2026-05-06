package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class DeliveryService {
	
	@Value("Home Delivery")
	private String serviceName;
	
	@Value("5")
	private int totalOrders;

	public void dilieverOder() {
		System.out.println("The order has been dilieverd");
	}

	public void showServiceInfo() {
		System.out.println("The service name: " + this.serviceName + "\nTotal Orders: " + this.totalOrders);
	}
}
