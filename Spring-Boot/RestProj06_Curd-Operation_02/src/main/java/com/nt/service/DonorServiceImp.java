package com.nt.service;

import com.nt.RestProj06CurdOperation02Application;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Donor;
import com.nt.exception.BloodDonorNotFoundException;
import com.nt.repository.IDonorRepository;

@Service
public class DonorServiceImp implements IDonorService {

	
	@Autowired
	private IDonorRepository repo;

	
	@Override
	public String registerDonor(Donor donor) {

		Long id = repo.save(donor).getId();
		return "Donor is register with id: " + id;
	}

	@Override
	
	public List<Donor> getAllDonors() {
		List<Donor> donorList = repo.findAll();
		return donorList;
	}

	@Override
	public Donor getDonorById(Long id) {
		Optional<Donor> donorContainer = repo.findById(id);

		Donor donor = null;
		try {
			if (donorContainer.isPresent())
				donor = donorContainer.get();
			else 
				throw new BloodDonorNotFoundException("Donor Not Found");
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return donor;

	}

	@Override
	public String updateDonor(Long id, Donor donor) {
		Optional<Donor> donorContainer = repo.findById(id);
		Donor d = null;
		try {
			if (donorContainer.isPresent()) {
				d = donorContainer.get();
				d.setDonorName(donor.getDonorName());
				d.setAge(donor.getAge());
				d.setBloodGroup(donor.getBloodGroup());
				d.setCity(donor.getCity());
				d.setMobile(donor.getMobile());
				repo.save(d);
			}
			else {
				throw new BloodDonorNotFoundException("Donor Not Found");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return d.getId()+"Donor is updated";
	}

	@Override
	public String deleteDonor(Long id) {
		repo.deleteById(id);
		return id+" Donor got Deleted";
	}

}
