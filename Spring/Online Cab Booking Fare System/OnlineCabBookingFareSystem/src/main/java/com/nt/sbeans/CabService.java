package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("cab")
public class CabService {

	@Value("${cab.id}")
	private  int cabId;
	
	@Value("${driver.name}")
	private String driverName;
	
	@Value("${car.model}")
	private String carModel;
	
	@Value("${base.fare}")
	private double baseFare;
	
	@Value("${km.charge}")
	private double perKmCharge;
	
	@Value("${is.available}")
	private boolean isAvailable;
	
	
	
	public void calculateFare(double distance) {
		System.out.println("Fare for "+distance+" km is "+(this.perKmCharge*distance));
	}
	
	public void showCabDetails() {
		System.out.println("Cab Details: \nCan id: "+this.cabId+"\nCab driver name: "+this.driverName+"\nCar model: "+this.carModel+"\nBase fare: "+this.baseFare+"\nPer km charge: "+this.perKmCharge+"\nAvailability: "+this.isAvailable);
	}
	
	
}
