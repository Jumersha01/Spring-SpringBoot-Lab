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
@Table(name="Donor_Info")
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Donor {
	
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
private String donorName;

@NonNull
private String bloodGroup;

private Integer age;

@NonNull
private String city;

@NonNull
private String mobile;
}
