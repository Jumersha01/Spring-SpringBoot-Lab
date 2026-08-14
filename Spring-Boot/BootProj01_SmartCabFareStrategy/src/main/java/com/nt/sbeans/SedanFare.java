package com.nt.sbeans;

import org.springframework.stereotype.Component;

import com.nt.comp.FareStrategy;

@Component("sedan")
public final class SedanFare implements FareStrategy {

	private double luxuryCharge = 1500;
	private double perKmCharge = 100;

	@Override
	public double calulateFare(int distance) {
		double fare = 0;

		if (distance >= 10) {
			fare += this.luxuryCharge + (this.perKmCharge * (distance - 10));
		} else {
			fare = distance * this.perKmCharge;
		}
		return fare;
	}

	@Override
	public void showVehicleType() {
		System.out.print("Vehicle Type : Sedan Total Fare: ");
	}

}
