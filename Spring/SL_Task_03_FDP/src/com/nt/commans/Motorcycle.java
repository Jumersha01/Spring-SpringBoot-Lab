package com.nt.commans;

import org.springframework.stereotype.Component;

@Component("mt")
public class Motorcycle implements Vehicle {
     String engineType="Electric";
     boolean isSideCar = false;
	@Override
	public String getDescription() {
		return "The Egine type of vehicle is : "+this.engineType+" and Side Car : "+this.isSideCar;
		
	}

}
