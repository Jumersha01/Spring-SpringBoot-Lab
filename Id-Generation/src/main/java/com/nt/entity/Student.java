package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Student_Ids")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Student_seq")
	@SequenceGenerator(name="Student_seq",sequenceName="std_seq",allocationSize=1)
	private Long id;
	//Comment
	@NonNull
	private String name;

}
