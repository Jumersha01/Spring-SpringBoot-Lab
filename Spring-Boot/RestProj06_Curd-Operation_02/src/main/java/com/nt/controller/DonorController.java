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

import com.nt.entity.Donor;
import com.nt.service.IDonorService;

@RestController
@RequestMapping("/donors-api")
public class DonorController {
     
	@Autowired
	private IDonorService service;
	
	@PostMapping("/donors")
	public String addDonor( @RequestBody Donor donor) {
	  String message = service.registerDonor(donor);
	  return message;
	}
	
	@GetMapping("/donors")
	public ResponseEntity<List<Donor>> getAllTheDonors(){
		List<Donor> donorList = service.getAllDonors();
		return  new ResponseEntity<List<Donor>>(donorList,HttpStatus.OK);
	}
	
	@GetMapping("/donors/{id}")
	public ResponseEntity<Donor> getDonorById(@PathVariable Long id){
		Donor donor = service.getDonorById(id);
		return new ResponseEntity<Donor>(donor,HttpStatus.OK);
	}
	
	@PutMapping("/donors/{id}")
	public String updateDonor(@PathVariable Long id,@RequestBody Donor donor) {
		String message = service.updateDonor(id, donor);
		return message;
	}
	
   
	@DeleteMapping("/donors/{id}")
	public String deleteById(@PathVariable Long id) {
		String message = service.deleteDonor(id);
		return message;
	}
	
}
