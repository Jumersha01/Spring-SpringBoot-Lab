package com.nt.service;

import java.util.Optional;

import com.nt.entity.Employee;

public interface IEmployeeService {

	String addSingleEmployee(Employee emp);

	String addMultipleEmployee(Iterable<Employee> emps);

	Optional<Employee> viewEmployeeById(Integer id);

	Iterable<Employee> viewAllEmployees();

	boolean isEmployeeExist(Integer id);

	Long getCount();

	String updateEmployee(Employee emp);

	void deleteEmployeeById(Integer id);

	void deleteEmployeeRecord(Employee emp);

	void deleteMultipleEmployees(Iterable<Employee> emp);
	
	void deleteAllEmployees();
	
	Iterable<Employee> findAllById(Iterable<Integer> id);

}
