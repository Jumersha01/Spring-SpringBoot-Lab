package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Employee;
import com.nt.service.EmployeeServiceImp;

@RestController
@RequestMapping("/employee-api")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImp service;

	@PostMapping("/employees")
	public String addEmployee(@RequestBody Employee emp) {
		String message = service.addEmployee(emp);
		return message;
	}

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAll() {
		List<Employee> employeeList = service.getAllEmployees();

		return new ResponseEntity<List<Employee>>(employeeList, HttpStatus.OK);
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmplooye(@PathVariable Long id) {
		Employee emp = service.getEmployeeById(id);

		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}

	@PutMapping("/employees/{id}")
	public String updateEmployee(@PathVariable Long id, @RequestBody Employee emp) {
		String message = service.updateEmployee(id, emp);
		return message;
	}

	@DeleteMapping("/employees/{id}")
	String deleteEmployee(@PathVariable Long id) {
		String message = service.DeleteEmployee(id);
		return message;
	}

}
