package com.nt.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="Festival")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Festival {
 
@Id
private Integer festivalId;

@NonNull
@Column(length=30)
private String festivalName;


@NonNull
@Column(length=30)
private String city;

 private LocalDate evenDate;
 private Double ticketPrice;
 
 @ManyToMany(mappedBy="festivalList",cascade=CascadeType.ALL)
 private List<Artist> artistList;
}
