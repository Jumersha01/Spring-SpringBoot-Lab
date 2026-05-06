package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("std")
public class Student {
@Value("${std.id}")
private int studentId;

@Value("${std.name}")
private String studentName;

@Value("${std.sub}")
private String studentSubject;

@Value("${std.marks}")
private double marks;

@Value("${std.percentage}")
private double passPercentage;

public void calculateResult() {
	if(this.passPercentage>=90) {
		System.out.println("Passed in Grade A");
	}
	else if(this.passPercentage<80&&this.passPercentage>=70) {
		System.out.println("Passed in Greade B");
	}
	else if(this.passPercentage<60&&this.passPercentage>=50) {
		System.out.println("Passed in Grade C");
	}
	else {
		System.out.println("Failed");
	}
}

public void showStudentInfo() {
	System.out.println("Student Information:\nStudent Id:"+this.studentId+"\nStudent Name: "+this.studentName+"\nStudent Subject: "+this.studentSubject+"\nStudent Marks: "+this.marks+"\nStudent Percentage: "+this.passPercentage);
	
}
}
