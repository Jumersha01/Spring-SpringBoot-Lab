package com.nt.controller;

import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private IEmployeeService service;
	
	
	public Iterable<Employee> getEmployeByPage(int pagNO, int pageSize) {
		 return service.getEmployeByPage(pagNO, pageSize);
	}

	
	public Iterable<Employee> getEmployeeSortedBySalary() {
	   return service.getEmployeeSortedBySalary();
	}

	
	public Iterable<Employee> getEmployeeSortedByName() {
		  Sort sort = Sort.by(Sort.Direction.ASC, "empName");
			return  service.getEmployeeSortedByName();
	}

	
	public  String addMultipleEmployee(Iterable<Employee> emps) {
		String message = service.addMultipleEmployee(emps);
		return message;
	}


}
