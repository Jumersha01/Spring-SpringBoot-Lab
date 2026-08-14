package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.EmployeeResume;
import com.nt.repository.EmployeeResumeRepository;

@Service
public class EmployeeResumeServiceImp implements IEmployeeResumeService {
    @Autowired
    private  EmployeeResumeRepository repo;
	
	@Override
	public String saveEmployeeResume(EmployeeResume empResume) {
		EmployeeResume resume = repo.save(empResume);
		return resume.getEid()+" Employee Saved :";
	}

	@Override
	public Optional<EmployeeResume> viewEmployeeResumt(int id) {
		
		Optional<EmployeeResume> empResume = repo.findById((long) id);
		
		return empResume;
	}

	@Override
	public Iterable<EmployeeResume> viewAllEmployeeResume() {
		Iterable<EmployeeResume> list = repo.findAll();\
		return list;
		
	}

	@Override
	public void deleteEmployeeResume() {
	

	}

}
