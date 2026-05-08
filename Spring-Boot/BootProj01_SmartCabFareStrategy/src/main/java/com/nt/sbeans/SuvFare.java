package com.nt.sbeans;

import org.springframework.stereotype.Component;

import com.nt.comp.FareStrategy;

@Component("suv")
public final class SuvFare implements FareStrategy {

	private double nightCharge = 800;
	private double perKmCharge = 80;

	@Override
	public double calulateFare(int distance) {
		double fare = 0;

		if (distance >= 10) {
			fare += this.nightCharge + (this.perKmCharge * (distance - 10));
		} else {
			fare = distance * this.perKmCharge;
		}
		return fare;
	}

	@Override
	public void showVehicleType() {
		System.out.print("Vehicle Type: SUV Total Fare: ");

	}

}
