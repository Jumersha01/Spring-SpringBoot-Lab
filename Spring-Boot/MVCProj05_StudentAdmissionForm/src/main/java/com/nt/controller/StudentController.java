package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.model.Student;

@Controller
public class StudentController {
 
	
@RequestMapping("/")
 public String home() {
	return "home";	
}
@GetMapping("/register")	
public String getStudent(@ModelAttribute("stud") Student stud){
	return "student";
}

@PostMapping("/register")
public String getStudentInfo(@ModelAttribute("stud1") Student stud ,Model model) {
	model.addAttribute("s", stud);
	return "info";
}

	
}
