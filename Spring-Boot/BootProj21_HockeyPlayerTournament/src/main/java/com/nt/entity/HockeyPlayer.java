package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="Hockey_Player")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class HockeyPlayer {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer playerId;
  
  @NonNull
  @Column(length=30)
  private String  playerName;
  
  @NonNull
  @Column(length=30)
  private String teamName;
  
  @NonNull
  @Column(length=30)
  private String country;
  
  @NonNull
  private String role;
  
  @NonNull
  private Integer goals;
  
  @NonNull
  private Double experience;
  
  @Version
  Integer version;
  
  @CreationTimestamp
  LocalDate createdAt;
  
  @UpdateTimestamp
  LocalDateTime updatedAt;
}
