package com.nt.sbeans;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ShoppingMonitoring {
    
	int id = 101;
	
	@Scheduled(fixedRate = 3000)
	public void checkOrders() {
		System.out.println("Order Id: "+(this.id++)+" Packed");
		System.out.println("Order Id: "+(this.id++)+" Shipped");
		System.out.println("Order Id: "+(this.id++)+" Deliverd");
		
	}
	
	@Scheduled(cron="*/5 * * * * * ")
	public void checkPaymentGateway() {
		System.out.println("UPI Service : Active\n"
				+ "Credit Card Service : Available\n"
				+ "Net Banking : Working");
	}
}
