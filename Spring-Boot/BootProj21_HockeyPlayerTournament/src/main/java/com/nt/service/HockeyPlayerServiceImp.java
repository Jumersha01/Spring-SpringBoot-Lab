package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.HockeyPlayer;
import com.nt.repository.HockeyPlayerRepository;
@Service
public class HockeyPlayerServiceImp implements IHockeyPlayerService{
     
	@Autowired
	private HockeyPlayerRepository repo;
	
	@Override
	public List<HockeyPlayer> findByTeamName(String team) {
		
		return repo.findByTeamName(team); 
	}

	@Override
	public List<HockeyPlayer> findPlayersWithGoalsGreaterThan(Integer goals) {
		
		return repo.findPlayersWithGoalsGreaterThan(goals);
	}

	@Override
	public List<HockeyPlayer> findByRoleAndCountry(String role, String country) {
		return repo.findByRoleAndCountry(role, country);
	}

	@Override
	public List<HockeyPlayer> findByNameContains(String keyword) {
		
		return repo.findByNameContains(keyword);
	}

	@Override
	public List<HockeyPlayer> findByExperienceBetween(Integer minExp, Integer maxExp) {
		
		return repo.findByExperienceBetween(minExp, maxExp);
	}

	@Override
	public Long countPlayersByTeam(String team) {
		return repo.countPlayersByTeam(team);
	}

	@Override
	public List<HockeyPlayer> findPlayersOrderByGoalsDesc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateGoals(Long id, Integer goals) {
		
		return repo.updateGoals(id, goals);
	}

	@Override
	public int deleteByCountry(String country) {
		return repo.deleteByCountry(country);
	}

	@Override
	public List<Object[]> getPlayerNameAndGoals() {
		
		return repo.getPlayerNameAndGoals();
	}

	@Override
	public String addMultiplePlayers(List<HockeyPlayer> list) {
		
		List<HockeyPlayer> list1 = repo.saveAll(list);
		
		return list1.size()+" Player are inserted: ";
	}
	
}
