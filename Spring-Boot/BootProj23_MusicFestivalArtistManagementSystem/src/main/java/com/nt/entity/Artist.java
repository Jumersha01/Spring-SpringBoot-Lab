package com.nt.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="Artist")
@Data

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Artist {
	
@Id	
 private Integer artistId;

@NonNull
@Column(length=30)
 private String artistName;

@NonNull
@Column(length=30)
 private String genre;

@NonNull
@Column(length=30)
 private String country;

 private Double yearsOfExperience;
 
 @ManyToMany(cascade=CascadeType.ALL)
 @JoinTable(name="artist_fest",joinColumns=@JoinColumn(name="artistId"),inverseJoinColumns=@JoinColumn(name="festivalId"))
 private List<Festival> festivalList;
}
