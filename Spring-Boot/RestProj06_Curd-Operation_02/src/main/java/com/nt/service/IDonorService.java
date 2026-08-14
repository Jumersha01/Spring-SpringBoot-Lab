package com.nt.service;

import java.util.List;

import com.nt.entity.Donor;

public interface IDonorService {
	
   public String registerDonor(Donor donor);
   
   List<Donor> getAllDonors();
   
   Donor getDonorById(Long id);
   
   String updateDonor(Long id,Donor donor);
   
   String deleteDonor(Long id);
   
   
}
