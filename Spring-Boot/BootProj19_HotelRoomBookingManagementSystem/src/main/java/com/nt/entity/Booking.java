
package com.nt.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="BOOKING")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
  @Id	
  private Long bookingId;
  private String guestName;
  private String roomType;
  private String city;
  private Double bookingAmount;
  private Integer numberOfDays;
  private LocalDate bookingDate;
  private String bookingStatus;
}
