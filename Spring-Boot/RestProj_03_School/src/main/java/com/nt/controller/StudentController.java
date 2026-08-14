package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student-api")
public class StudentController {

	@GetMapping("/info")
	public String getStudentInfo() {
		
		return "Returnig Student Info";
	}
	
	@GetMapping("/courses")
	public String getCoursesInfo() {
		return "Returning courses Info";
	}
	
}
