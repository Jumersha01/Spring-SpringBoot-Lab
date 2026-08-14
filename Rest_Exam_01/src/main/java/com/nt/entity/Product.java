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
@Table(name="Products_Details_001")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Product {

	@Id	
	@GeneratedValue(
	        strategy = GenerationType.SEQUENCE,
	        generator = "emp_seq_gen"
	    )
	    @SequenceGenerator(
	        name = "emp_seq_gen",
	        sequenceName = "emp_seq",
	        allocationSize = 1
	    )
private Long id;

@NonNull
private String name;

private String category;

private Integer quauntity;

private String brand;

}
