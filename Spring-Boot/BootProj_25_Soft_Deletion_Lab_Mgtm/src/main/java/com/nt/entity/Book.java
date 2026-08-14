package com.nt.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="Library_Mgt")
@Data
@SQLDelete(sql="update Library_Mgt set deleted=1 where id=? ")
@SQLRestriction("deleted=0")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Book {

@Id
private Integer id;

@NonNull
private String title;
//Added some comment
@NonNull
private String cetegory;

private Double price;

private Boolean availabe;

private Integer deleted;
}
