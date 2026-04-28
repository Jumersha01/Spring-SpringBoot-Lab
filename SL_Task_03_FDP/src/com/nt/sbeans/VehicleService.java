package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.commans.Vehicle;
import com.nt.factory.VehicleFactory;

@Component("vs")
public class VehicleService {
@Autowired
VehicleFactory vehicleFactory;

public String createVehicle(String type,String engineType) {
	
	return this.vehicleFactory.createVehicle(type, engineType).getDescription();
}

	
	
}
