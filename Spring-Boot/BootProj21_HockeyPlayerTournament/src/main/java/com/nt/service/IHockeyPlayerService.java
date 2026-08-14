package com.nt.service;

import java.util.List;

import com.nt.entity.HockeyPlayer;

public interface IHockeyPlayerService {
	List<HockeyPlayer> findByTeamName(String team);

    List<HockeyPlayer> findPlayersWithGoalsGreaterThan(Integer goals);

    List<HockeyPlayer> findByRoleAndCountry(String role, String country);

    List<HockeyPlayer> findByNameContains(String keyword);

    List<HockeyPlayer> findByExperienceBetween(Integer minExp, Integer maxExp);

    Long countPlayersByTeam(String team);

    List<HockeyPlayer> findPlayersOrderByGoalsDesc();

    int updateGoals(Long id, Integer goals);

    int deleteByCountry(String country);

    List<Object[]> getPlayerNameAndGoals();
    
    String addMultiplePlayers(List<HockeyPlayer> list);
}
