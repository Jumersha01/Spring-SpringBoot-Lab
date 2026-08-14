package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Course;
import com.nt.entity.University;
import com.nt.repository.UniversityManagementRepository;

@Service
public class UniversityServiceImp implements IUniversityService {
@Autowired
 private UniversityManagementRepository repo;


@Override
public String saveUniversity(University university) {
	Long id = repo.save(university).getUniversityId();
	return "University is saved with id: "+id;
}

	@Override
	public Iterable<University> retriveUniversityDetails() {
		return repo.findAll();
	}




}
