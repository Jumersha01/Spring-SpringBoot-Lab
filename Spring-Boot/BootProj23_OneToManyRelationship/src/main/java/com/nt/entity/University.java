package com.nt.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="University_Details")
@NoArgsConstructor	
@RequiredArgsConstructor
@AllArgsConstructor
public class University {
@Id	
private Long universityId;

@NonNull
private String universityName;

@NonNull
private String city;

@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
@JoinColumn(name="university_id")
List<Course> courses;

public String toString() {
	return "University Name:"+this.getUniversityName()+"University Id: "+this.getUniversityId()+"University City: "+this.getCourses();
}
}
