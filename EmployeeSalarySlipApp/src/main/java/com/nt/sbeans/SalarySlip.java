package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("salslip")
public class SalarySlip {
	
 @Autowired	
 Employee  employe;
 public void generateSlip() {
	 double grossSalary = ((this.employe.basicSalary)+(employe.hra)+(employe.da));
	 
	 double taxAmount = (grossSalary*employe.taxPercentage)/100;
	 double netSalary = (grossSalary-taxAmount);
	 
	 System.out.println("Salary Slip  for "+employe.name+"\n" +"Gross Salary: "+grossSalary+"\nTax Amount: "+taxAmount+"\nNet Salary: "+netSalary);
	 
 }
}
