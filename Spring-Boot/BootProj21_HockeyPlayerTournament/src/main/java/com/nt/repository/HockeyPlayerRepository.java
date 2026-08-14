package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.entity.HockeyPlayer;

import jakarta.transaction.Transactional;

public interface HockeyPlayerRepository extends JpaRepository<HockeyPlayer,Integer> {
 
	
	    // Find players by team name
	    @Query("SELECT h FROM HockeyPlayer h WHERE h.teamName = :team")
	    List<HockeyPlayer> findByTeamName(@Param("team") String team);

	    // Find players with goals greater than given value
	    @Query("SELECT h FROM HockeyPlayer h WHERE h.goals > :goals")
	    List<HockeyPlayer> findPlayersWithGoalsGreaterThan(@Param("goals") Integer goals);

	    // Find players by role and country
	    @Query("SELECT h FROM HockeyPlayer h WHERE h.role = :role AND h.country = :country")
	    List<HockeyPlayer> findByRoleAndCountry(@Param("role") String role,
	                                            @Param("country") String country);

	    // Find players whose name contains a keyword
	    @Query("SELECT h FROM HockeyPlayer h WHERE h.playerName LIKE %:keyword%")
	    List<HockeyPlayer> findByNameContains(@Param("keyword") String keyword);

	    // Find players within an experience range
	    @Query("SELECT h FROM HockeyPlayer h WHERE h.experience BETWEEN :minExp AND :maxExp")
	    List<HockeyPlayer> findByExperienceBetween(@Param("minExp") Integer minExp,
	                                               @Param("maxExp") Integer maxExp);

	    // Count players in a team
	    @Query("SELECT COUNT(h) FROM HockeyPlayer h WHERE h.teamName = :team")
	    Long countPlayersByTeam(@Param("team") String team);

	    // Get all players ordered by goals in descending order
	    @Query("SELECT h FROM HockeyPlayer h ORDER BY h.goals DESC")
	    List<HockeyPlayer> findPlayersOrderByGoalsDesc();

	    // Update goals of a player
	    @Modifying
	    @Transactional
	    @Query("UPDATE HockeyPlayer h SET h.goals = :goals WHERE h.playerId = :id")
	    int updateGoals(@Param("id") Long id,
	                    @Param("goals") Integer goals);

	    // Delete players by country
	    @Modifying
	    @Transactional
	    @Query("DELETE FROM HockeyPlayer h WHERE h.country = :country")
	    int deleteByCountry(@Param("country") String country);

	    // Fetch only player name and goals
	    @Query("SELECT h.playerName, h.goals FROM HockeyPlayer h")
	    List<Object[]> getPlayerNameAndGoals();
}
