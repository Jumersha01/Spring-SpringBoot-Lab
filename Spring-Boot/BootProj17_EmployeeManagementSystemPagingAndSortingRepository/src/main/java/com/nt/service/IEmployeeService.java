package com.nt.service;

import java.awt.print.Pageable;

import org.springframework.boot.data.autoconfigure.web.DataWebProperties.Sort;

import com.nt.entity.Employee;

public interface IEmployeeService {
	
  Iterable<Employee> getEmployeByPage(int pagNO,int pageSize);
  Iterable<Employee> getEmployeeSortedBySalary();
  Iterable<Employee> getEmployeeSortedByName();
  String addMultipleEmployee(Iterable<Employee> emps);
}
