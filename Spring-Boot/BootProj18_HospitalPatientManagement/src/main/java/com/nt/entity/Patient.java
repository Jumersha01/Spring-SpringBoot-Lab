package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Patien_Mgmt")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
  @Id
  @Column(name="PID")
  private Integer id;
  
  @Column(name="PNAME")
  private String name;
  
  @Column(name="Disease")
  private String disease;
  
  @Column(name="PAGE")
  private Integer age;
}
