package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="Student_Course_Details")
@Data
@AllArgsConstructor
@RequiredArgsConstructor

public class Student {
	
 @Id	
 private Integer studentId;
 private String studentName;
 private String courseName;
 private Double courseFee;
 private String instituteName;
 
 
}
