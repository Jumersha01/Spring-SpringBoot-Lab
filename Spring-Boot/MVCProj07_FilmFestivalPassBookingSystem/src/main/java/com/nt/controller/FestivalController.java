package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.FestivalPass;

@Controller
public class FestivalController {
  
	@GetMapping("/")
	public String getHome(@ModelAttribute("fes") FestivalPass pass) {
		return "register_form";
		
	}
	
	@PostMapping("/register")
	public String getFestivalPassInfo(@ModelAttribute("fes") FestivalPass pass,Model m) {

			
		m.addAttribute("fes",pass);
		
		return "info";
	}
	
	
}
