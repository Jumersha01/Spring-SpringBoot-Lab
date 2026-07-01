package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Festival;

public interface FestivalRepository extends JpaRepository<Festival, Integer> {

}
