package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Patient;

public interface IPateintRepository extends JpaRepository<Patient, Integer> {

}
