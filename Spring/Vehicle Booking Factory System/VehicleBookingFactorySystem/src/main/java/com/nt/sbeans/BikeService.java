package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.comp.VehicleService;
@Component("bike")
public class BikeService implements VehicleService {

	@Value("Yamaha")
	private String bikeName;
	
	@Value("2000")
	private double  rentPerHour;
	
	@Override
	public void bookVehicle() {
	System.out.println("Bike Service Booked");
		
	}

	@Override
	public void vehicleInfo() {
		System.out.println("Vehicle Details: \nVehicle Name: "+this.bikeName+"\nRent Per Hour: "+this.rentPerHour);
		
	}
	

	

	
}
