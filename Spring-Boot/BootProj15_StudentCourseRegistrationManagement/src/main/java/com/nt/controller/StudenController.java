package com.nt.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.entity.Student;
import com.nt.service.IStudentService;

@Controller
public class StudenController {
 @Autowired
 private  IStudentService  service;
 
 

	public String registerStudent(Student s) {
		String message = service.registerStudent(s);
		return message;
	}


	public Iterable<Student> getAllStudent() {
		 Iterable<Student> students =service.getAllStudent();
		return  students;
	} 

	
	public Optional<Student> getStudentById(Integer id) {
		Optional<Student> student = service.getStudentById(id);
		return student;
	}

	
	public String updateStudent(Student s) {
		String message = service.updateStudent(s);
		return message;
		
	}


	public void deleteStudent(Student s) {
		service.deleteStudent(s);
		

	}

	
	public long countStudents() {
		Long count = service.countStudents();
		return count;
	}

 
}
