package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@Entity
@Table(name="Course_Details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
	
@Id	
private Long courseId;

private String courseTitle ;

private String category;


private String instructorName;


private Double price;

private Integer durationInHours;


private Double rating;

@Column(length=30)
private String language;
}
