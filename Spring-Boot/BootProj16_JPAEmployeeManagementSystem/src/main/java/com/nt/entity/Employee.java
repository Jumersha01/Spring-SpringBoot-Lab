package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.RequiredArgsConstructor;

@Entity
@Table(name="Employees")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {
	
	@Id
	@Column(name="EID")
	Integer employeeId;
	
	@Column(name="ENAME")
	String empName;
	
	@Column(name="DNAME")
	String departmentName;
	
	@Column(name="ESAL")
	Double salary;
	
	
}
