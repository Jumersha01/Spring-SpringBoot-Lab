package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Employee;

public interface IEmployRepository extends JpaRepository<Employee, Integer> {

}
