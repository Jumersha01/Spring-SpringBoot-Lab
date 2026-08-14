package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter

@Table(name="Courses_Details")
@NoArgsConstructor
@RequiredArgsConstructor

public class Course {
  @Id	
  private Long courseId;
  @NonNull
  private String courseName;
  
  @NonNull
  private String duration;
  
  private Double fee;
  public String toString() {
	  return " Couse Id: "+this.getCourseId()+" Course Name: "+this.getCourseName()+" Duration: "+this.getDuration()+" Fee: "+this.getFee(); 
  }
}
