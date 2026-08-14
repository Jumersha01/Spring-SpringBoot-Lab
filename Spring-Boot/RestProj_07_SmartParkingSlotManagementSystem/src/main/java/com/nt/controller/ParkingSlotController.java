package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.ParkingSlot;
import com.nt.exception.ParkingSlotNotFoundException;
import com.nt.service.IParkingSlotService;

@RestController
@RequestMapping("/api")
public class ParkingSlotController {

	@Autowired
	private IParkingSlotService service;

	@PostMapping("/parking-slots")
	public ResponseEntity<ParkingSlot> registSlot(@RequestBody ParkingSlot slot) {
		ParkingSlot slt = service.addParkigSlot(slot);
		return new ResponseEntity<ParkingSlot>(slt, HttpStatus.CREATED);
	}

	@GetMapping("/parking-slots")
	public ResponseEntity<List<ParkingSlot>> getAllSlots() {
		List<ParkingSlot> listOfSlots = service.getAllParkingSlots();
		return new ResponseEntity<List<ParkingSlot>>(listOfSlots, HttpStatus.OK);
	}

	@GetMapping("/parking-slots/{id}")
	public ResponseEntity<ParkingSlot> getSlotByIds(@PathVariable Long id) {
		ParkingSlot slot = service.getParkingSlotById(id);

		if (slot != null)
			return new ResponseEntity<ParkingSlot>(slot, HttpStatus.OK);
		else
			throw new ParkingSlotNotFoundException("Slot Not Found");

	}

	@PutMapping("/parking-slots/{id}")
	public String updateSlot(@PathVariable Long id, @RequestBody ParkingSlot slot) {

		String message = service.updateParkingSlot(id, slot);
		if (message != null)
			return message;
		else
			throw new ParkingSlotNotFoundException("Slot not Found Exeption");

	}

	@DeleteMapping("/parking-slots/{id}")
	public String deletedById(@PathVariable Long id) {
		String message = service.deleteParkingSlot(id);
		if (message != null)
			return message;
		else
			throw new ParkingSlotNotFoundException("Slot not Found Exception");
	}

}
