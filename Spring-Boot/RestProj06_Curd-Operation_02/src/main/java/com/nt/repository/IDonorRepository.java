package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Donor;

public interface IDonorRepository extends JpaRepository<Donor, Long> {

}
