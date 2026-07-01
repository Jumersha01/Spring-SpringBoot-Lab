package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.comp.Employee;

@Controller
public class Welcome {
  
	@RequestMapping("/")
	public String getMessage() {
		return "Welcome";
	}
	
	@RequestMapping("/student")
	public String getStudentMessage(Map<String,Object> map) {
		
		map.put("wellComeMessage", "WelcomStudent");
		
		return "Student";
	}
	@RequestMapping("/employee")
	public String getEmployee(Map<String,Employee> map) {
		map.put("Employee", new Employee(101,"Vinit",50000D));
		
		return "Employees";
	}
}
