package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor

public class FootballPlayer {
  @Id
  private Integer playerId;
  
  @NonNull
  private String playerName;
  
  @NonNull
  private String country;
  
  @NonNull
  private String club;
  
  @NonNull
  private String position;
  
  @NonNull
  private Double salary;
  
  @NonNull
  private Integer jerseyNumber;
  
  @Version
  Integer version;
  
  @CreationTimestamp
  LocalDate createdAt;
  
  @UpdateTimestamp
  LocalDateTime updatedAt;
  
}
