package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("rb")
public class RideBooking {
	@Value("101")
	private int rideId;

	@Value("AmeerPet")
	private String location;
	
	@Autowired
	Driver driver;
	
	public void bookRide() {
		//driver.driveCab();
		System.out.println("The cab is beeen booked");
	}
}
