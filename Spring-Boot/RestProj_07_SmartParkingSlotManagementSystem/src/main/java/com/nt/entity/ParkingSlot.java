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
@Table(name="Slot_Management")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class ParkingSlot {
	
	@Id
	   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "slot_seq_gen")
    @SequenceGenerator(
        name = "slot_seq_gen", 
        sequenceName = "slotid_sequence", 
        allocationSize = 1
    )
    private Long id;
	
	@NonNull
    private String slot;
	
    private Integer floorNo;
    
    @NonNull
    private  String vehicleType;
    
    private Double hourlyRate;
    
    private Boolean available;
}
