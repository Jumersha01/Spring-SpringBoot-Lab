package com.nt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nt.entity.Patient;
import com.nt.repository.IPateintRepository;
@Service
public class IPatienServiceImp implements IPatientService {
	
  @Autowired	
  private IPateintRepository repository;
	@Override
	public Iterable<Patient> getPatienByPage(int pageNO, int pageSize) {
		PageRequest pageable = PageRequest.of(pageNO, pageSize);
		
		Page<Patient> p  = repository.findAll(pageable);
		System.out.println("Next: "+p.hasNext());
		System.out.println("Previous: "+p.hasPrevious());
		System.out.println("Count: "+p.getNumber());
		return p;
		
	}
	
	@Override
	public Iterable<Patient> addMuliplePatinet(Iterable<Patient> patient) {
		System.out.println("Multiple Patient Added:");
	  return 	repository.saveAll(patient);
	
	}

}
