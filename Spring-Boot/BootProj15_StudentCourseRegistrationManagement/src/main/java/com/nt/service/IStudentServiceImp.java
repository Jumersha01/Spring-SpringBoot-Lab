package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Student;
import com.nt.repository.IStudentRepository;

@Service
public class IStudentServiceImp implements IStudentService {

	@Autowired
	private IStudentRepository repository;
	
	@Override
	public String registerStudent(Student s) {
		Student s1 = repository.save(s);
		return "Student is registered with id: "+s1.getStudentId();
	}

	@Override
	public Iterable<Student> getAllStudent() {
		 Iterable<Student> students = repository.findAll();
		return  students;
	} 

	@Override
	public Optional<Student> getStudentById(Integer id) {
		Optional<Student> student = repository.findById(id);
		return student;
	}

	@Override
	public String updateStudent(Student s) {
		 repository.save(s);
		return  "Student is Updated: ";
	}

	@Override
	public void deleteStudent(Student s) {
		repository.delete(s);
		System.out.println("Student is Deleted:");

	}

	@Override
	public long countStudents() {
		Long count = repository.count();
		return count;
	}

}
