package com.nt.sbeans;

import org.springframework.stereotype.Component;

import com.nt.comp.FareStrategy;

@Component("mf")
public final class MiniFare implements FareStrategy {

	private double baseFare = 500;
	private double perkmCharge = 12;

	@Override
	public double calulateFare(int distance) {
		double fare = 0;

		if (distance >= 10) {
			fare += this.baseFare + (this.perkmCharge * (distance - 10));
		} else {
			fare = distance * this.perkmCharge;
		}
		return fare;

	}

	@Override
	public void showVehicleType() {
		System.out.print("Fare type: MiniFare\nBase Fare: ");

	}

}
