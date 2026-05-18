package com.nt.sbeans;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Stock {

	@Scheduled(cron=" */3 * * * * *  ")
	public void monitoring() {
		System.out.println("Checking Warehouse Inventory Status..\nLaptop : Available in Stock\n"
				+ "Mobile : Out Of Stock\n"
				+ "Headphones : Low Stock — Refill Required\n"
				+ "");
		
	}
}
