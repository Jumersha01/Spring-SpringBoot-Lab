package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("emp")
@PropertySource(value = "com/nt/components/info.properties")
public class Employee {

	int id;
	String name;
	double basicSalary;

	double hra;

	double da;

	double taxPercentage;

	public Employee() {
		super();
		this.id = 101;
		this.name = "Junaid";
		this.basicSalary = 45000;
		this.hra = 2500;
		this.da = 2500;
		this.taxPercentage = 10;
	}

}
