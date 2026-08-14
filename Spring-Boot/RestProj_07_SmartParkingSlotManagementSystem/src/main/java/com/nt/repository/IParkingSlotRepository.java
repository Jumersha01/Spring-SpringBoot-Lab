package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.ParkingSlot;

public interface IParkingSlotRepository extends JpaRepository<ParkingSlot, Long> {

}
