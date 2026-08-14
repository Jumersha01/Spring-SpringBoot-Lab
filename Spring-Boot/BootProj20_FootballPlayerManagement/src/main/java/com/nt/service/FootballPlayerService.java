package com.nt.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.nt.entity.FootballPlayer;
//Service interface
public interface FootballPlayerService {
	
	List<FootballPlayer> findByClub(String club);

    List<FootballPlayer> findBySalaryGreaterThan(Double salary);

    List<FootballPlayer> findByPositionAndCountry(String position,String country);

    List<FootballPlayer> findByPlayerNameStartingWith(String prefix);

    List<FootballPlayer> findByJerseyNumberBetween(Integer start,Integer end);

    Long countByCountry(String country);

    List<FootballPlayer> findAllByOrderBySalaryDesc();

    
    int updateSalary(Long id, Double salary);

   
    int deleteByClub(String club);

   
    List<Object[]> getPlayerNameAndClub();
    
    String addPlayer(List<FootballPlayer> players);
}
