package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.comp.VehicleService;

@Component("car")
public class CarService implements VehicleService {
 
	@Value("Hell Cat SRT")
	private String carName;
	
	@Value("Diesel")
	private String fuelType;
	
	@Override
	public void bookVehicle() {
	System.out.println("Car Vehicle Service booked");

	}

	@Override
	public void vehicleInfo() {
	  System.out.println("Car Name: "+this.carName+"\nFuel Type: "+this.fuelType);

	}

}
