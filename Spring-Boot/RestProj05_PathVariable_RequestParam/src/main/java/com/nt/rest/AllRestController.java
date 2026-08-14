package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllRestController {
  
	@GetMapping("/welcome/{name}")
	public String wellcome(@PathVariable String name){
		return "Wellcome :"+name;
	}
	//Added some comment on the handlder method
	
	@GetMapping("/student")
	public  String getStudent(@RequestParam("name") String sname) {
		return "Hellow Student, "+sname;
	}
	
	@GetMapping("/product/{id}")
	public String getProduct(@PathVariable int id) {
		return "Product id :"+id;
	}
	
	@GetMapping("/employee")
	public String getEmployee(@RequestParam("dept") String department) {
		return "Employeee Belongs to :"+department;
	}
	@GetMapping("add/{city}")
	public String getCity(@PathVariable("city") String city,@RequestParam String state) {
		return "City :"+city+" State :"+state;
	}
	
}
