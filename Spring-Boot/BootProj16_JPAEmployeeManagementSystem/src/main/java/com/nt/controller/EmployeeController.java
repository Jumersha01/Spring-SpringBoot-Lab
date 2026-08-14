package com.nt.controller;

import com.nt.BootProj16JpaEmployeeManagementSystemApplication;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeService;

@Controller
public class EmployeeController {
	
	
	@Autowired
	private IEmployeeService service;
		
	public String addSingleEmployee(Employee emp) {
		System.out.println("Adding singe Employee:...");
		return service.addSingleEmployee(emp);
	}

	public String addMultipleEmployee(Iterable<Employee> emps) {
		 System.out.println("Adding Multiple Employees:...");
		return service.addMultipleEmployee(emps);
	}

	public Optional<Employee> viewEmployeeById(Integer id) {
		System.out.println("Getting Employee by Id:...");
		return service.viewEmployeeById(id);
	}

	public Iterable<Employee> viewAllEmployees() {
		System.out.println("Viewing All the Employees:...");
		return service.viewAllEmployees();
	}

	public boolean isEmployeeExist(Integer id) {
		return service.isEmployeeExist(id);
	}

	public Long getCount() {
		System.out.println("Getting Employee Record:...");
		return service.getCount();
	}

	public String updateEmployee(Employee emp) {
		System.out.println("Upadating Employee:...");
		return service.updateEmployee(emp);
	}

	public void deleteEmployeeById(Integer id) {
		System.out.println("Deleting Record based On Id:...");
		service.deleteEmployeeById(id);
	}

	public void deleteEmployeeRecord(Employee emp) {
		System.out.println("Deleting Single Record:...");
		service.deleteEmployeeRecord(emp);
	}

	public void deleteMultipleEmployees(Iterable<Employee> emps) {
		System.out.println("Deleting Muliple Records:...");
		service.deleteMultipleEmployees(emps);
	}

	public void deleteAllEmployees() {
		System.out.println("Deleting all the Records:...");
		service.deleteAllEmployees();
	}
	
public Iterable<Employee> findAllById(Iterable<Integer> id) {
		
		return service.findAllById(id);
	}

}
