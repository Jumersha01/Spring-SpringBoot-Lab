package com.nt.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.model.Student;



@Controller
public class StudentController {
	
	@RequestMapping("/")
	public String home() {
		return "Index";
	}
	@RequestMapping("/student")
	public String getStudent(Model model) {
		model.addAttribute("Name", "Junaid");
		model.addAttribute("course", "Java Full Stack");
		model.addAttribute("City", "Hydrabad");
		return "Student";
	}
	
	@RequestMapping("/employee")
	public String getEmployee(Model model) {
		model.addAttribute("id", 101);
		model.addAttribute("name", "Junaid");
		model.addAttribute("department", "IT");
		model.addAttribute("salary", 65000);
		return "Employee";
	}
	
}
