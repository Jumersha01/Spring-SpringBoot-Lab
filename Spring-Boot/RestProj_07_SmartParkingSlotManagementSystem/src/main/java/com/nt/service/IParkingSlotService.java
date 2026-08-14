package com.nt.service;

import java.util.List;

import com.nt.entity.ParkingSlot;

public interface IParkingSlotService {

	ParkingSlot addParkigSlot(ParkingSlot slot);

	List<ParkingSlot> getAllParkingSlots();

	ParkingSlot getParkingSlotById(Long id);

	String updateParkingSlot(Long id, ParkingSlot slot);

	String deleteParkingSlot(Long id);

}
