package com.nt.factory;

import com.nt.commans.Vehicle;

public interface VehicleFactory {
Vehicle createVehicle(String type,String engineType);
}
