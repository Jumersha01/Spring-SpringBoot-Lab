package com.nt.factory;

import org.springframework.stereotype.Component;


import com.nt.commans.Car;
import com.nt.commans.Motorcycle;
import com.nt.commans.Truck;
import com.nt.commans.Vehicle;

@Component("vf")
public class ConcreteVehicleFactory implements VehicleFactory {

	@Override
	public Vehicle createVehicle(String type, String engineType) {
		Vehicle vehicle = null;
		if(type.equalsIgnoreCase("Car")||engineType.equalsIgnoreCase("Electric")) {
			vehicle=new Car();
		}
		else if(type.equalsIgnoreCase("Bike")&&engineType.equalsIgnoreCase("Electric")) {
			vehicle = new Motorcycle();
		}
		else {
			vehicle = new Truck();
		}
		return vehicle;
	}

}
