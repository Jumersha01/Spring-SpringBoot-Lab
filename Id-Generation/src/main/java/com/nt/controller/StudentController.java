package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Student;
import com.nt.service.StudentServiceImp;

@RestController
public class StudentController {
   
	@Autowired
	private StudentServiceImp service;
	
	@PostMapping("/student")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		Student std  = service.addStudent(student);
		return new ResponseEntity<Student>(std,HttpStatus.OK);
	}
	
	@GetMapping("/student")
	public ResponseEntity<List<Student>> getAllStudent(){
		List<Student> studentList = service.getAllStudent();
		return new ResponseEntity<List<Student>>(studentList,HttpStatus.OK);
	}
	
	@DeleteMapping("/student/{id}")
	String deleteStudent(@PathVariable Long id) {
		 return service.deleteStudent(id);
	}
	
	
}
