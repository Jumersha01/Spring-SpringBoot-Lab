package com.nt.commans;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle {

	String enginType="Electric";
	int noOfDoors =4;
	@Override
	public String getDescription() {
		return "The Egine type of vehicle is : "+this.enginType+" and no of doors is : "+this.noOfDoors;
}

}
