package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class EmployeeResume {
 @Id	
 private Long eid;
 
 @NonNull
 private String name;
 
 @Column(columnDefinition = "CLOB") 
 private String resumeContent;
}
