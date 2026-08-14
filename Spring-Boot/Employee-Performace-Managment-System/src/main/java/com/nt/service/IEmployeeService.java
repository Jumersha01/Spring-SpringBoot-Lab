package com.nt.service;

import java.util.List;

import com.nt.entity.Employee;

public interface IEmployeeService {

	String addEmployee(Employee emp);

	List<Employee> getAllEmployees();

	Employee getEmployeeById(Long id);

	String updateEmployee(Long id, Employee emp);

	String DeleteEmployee(Long id);

}
