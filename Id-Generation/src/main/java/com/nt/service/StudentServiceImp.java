package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Student;
import com.nt.repository.StudentRepository;


@Service
public class StudentServiceImp  implements IStudentService{
	
	@Autowired
	private StudentRepository repo;

	@Override
	public Student addStudent(Student student) {
		
		return repo.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return repo.findAll();
	}

	@Override
	public String deleteStudent(Long id) {
		Student std = repo.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid id"));
		repo.delete(std);
		return "Student deleted with id: "+id;
	}

}
