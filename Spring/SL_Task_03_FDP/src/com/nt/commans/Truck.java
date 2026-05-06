package com.nt.commans;

import org.springframework.stereotype.Component;

@Component("tr")
public class Truck implements Vehicle {

	String engineType="Diesel";
	int payLoadCapacity = 14000;
	@Override
	public String getDescription() {
		
		 return "The Egine type of vehicle is :"+this.engineType+" and Payload  is : "+this.payLoadCapacity;
	}

}
