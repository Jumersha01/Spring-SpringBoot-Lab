package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.comp.FareStrategy;

@Component
public class CabBooking {
	@Autowired
	@Qualifier("fare")
	FareStrategy strategy;

	@Value("${c.name}")
	private String customerName;

	@Value("${c.distance}")
	private int distance;

	public void bookCab() {
		System.out.println("The cab has been Booked by " + this.customerName);
		;
	}

	public void generateBill() {
		strategy.showVehicleType();
		System.out.print(this.strategy.calulateFare(this.distance));

	}

}
