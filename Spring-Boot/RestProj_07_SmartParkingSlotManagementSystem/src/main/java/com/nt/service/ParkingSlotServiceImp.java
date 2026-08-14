package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.ParkingSlot;
import com.nt.repository.IParkingSlotRepository;

@Service
public class ParkingSlotServiceImp implements IParkingSlotService {

	@Autowired
	private IParkingSlotRepository repo;

	@Override
	public ParkingSlot addParkigSlot(ParkingSlot slot) {
		
		ParkingSlot ps = repo.save(slot);
		return ps;
	}

	@Override
	public List<ParkingSlot> getAllParkingSlots() {
		
		List<ParkingSlot> listOfParkingSlots = repo.findAll();
		return  listOfParkingSlots;
	}

	@Override
	public ParkingSlot getParkingSlotById(Long id) {
		
		Optional<ParkingSlot> ps = repo.findById(id);
		
		if(ps.isPresent()) 
			return ps.get();
		else
			return null;
	}

	@Override
	public String updateParkingSlot(Long id, ParkingSlot slot) {
Optional<ParkingSlot> p = repo.findById(id);
		
		if(p.isPresent()) 
		{
			ParkingSlot ps = p.get();
		  ps.setSlot(slot.getSlot());
		  ps.setAvailable(slot.getAvailable());
		  ps.setFloorNo(slot.getFloorNo());
		  ps.setHourlyRate(slot.getHourlyRate());
		  ps.setVehicleType(slot.getVehicleType());
		  repo.save(ps);
		return  ps.getId()+" Id Slot updated";
		  
		}
		else
			return null;	  
	}

	@Override
	public String deleteParkingSlot(Long id) {
		 if(this.getParkingSlotById(id)!=null) {
			 repo.deleteById(id);
			 return id+"Slot is deleted";
		 }
		 else
		     return null;
	}

}
