package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.FootballPlayer;
import com.nt.repository.FootBallPlayerRepository;

@Service
public class FootballPlayerServiceImp implements FootballPlayerService {

	@Autowired
	private FootBallPlayerRepository playerRepo;
	
	@Override
	public List<FootballPlayer> findByClub(String club) {
		
		return playerRepo.findByClub(club);
	}

	@Override
	public List<FootballPlayer> findBySalaryGreaterThan(Double salary) {
		
	return playerRepo.findPlayersWithSalaryGreaterThan(salary);
	}

	@Override
	public List<FootballPlayer> findByPositionAndCountry(String position, String country) {
		
		return playerRepo.findByPositionAndCountry(position,country);
	}

	@Override
	public List<FootballPlayer> findByPlayerNameStartingWith(String prefix) {
		return playerRepo.findByNameStartsWith(prefix);
	}

	@Override
	public List<FootballPlayer> findByJerseyNumberBetween(Integer start, Integer end) {

		return  playerRepo.findByJerseyNumberBetween(start, end);
	}

	@Override
	public Long countByCountry(String country) {
		
		return playerRepo.countPlayersByCountry(country);
	}

	@Override
	public List<FootballPlayer> findAllByOrderBySalaryDesc() {
		
		return playerRepo.findHighestPaidPlayers();
	}

	@Override
	public int updateSalary(Long id, Double salary) {
		
		return playerRepo.updateSalary(id, salary);
	}

	@Override
	public int deleteByClub(String club) {
		return playerRepo.deleteByClub(club);
	}

	@Override
	public List<Object[]> getPlayerNameAndClub() {
		return playerRepo.getPlayerNameAndClub();
	}

	@Override
	public String addPlayer(List<FootballPlayer> players) {
		 List<FootballPlayer> list = playerRepo.saveAll(players).stream().toList();
		return list.size()+"Player are inserted: ";
	}

}
