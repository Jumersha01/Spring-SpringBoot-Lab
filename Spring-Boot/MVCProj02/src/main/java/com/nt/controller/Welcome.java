package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
