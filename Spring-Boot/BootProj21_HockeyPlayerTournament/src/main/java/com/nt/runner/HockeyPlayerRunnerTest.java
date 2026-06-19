package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.HockeyPlayer;
import com.nt.service.IHockeyPlayerService;

@Component
public class HockeyPlayerRunnerTest implements CommandLineRunner {
  @Autowired
  private IHockeyPlayerService service;
	@Override
	public void run(String... args) throws Exception {
		
		HockeyPlayer p1 = new HockeyPlayer("Manpreet Singh", "India Warriors", "India", "Midfielder", 45, 12.5);
		HockeyPlayer p2 = new HockeyPlayer("Harmanpreet Singh", "India Warriors", "India", "Defender", 60, 10.0);
		HockeyPlayer p3 = new HockeyPlayer("Mandeep Singh", "Punjab Tigers", "India", "Forward", 75, 8.5);
		HockeyPlayer p4 = new HockeyPlayer("Arun Kumar", "Delhi Strikers", "India", "Forward", 40, 5.0);
		HockeyPlayer p5 = new HockeyPlayer("Blake Govers", "Sydney Sharks", "Australia", "Forward", 90, 11.0);
		HockeyPlayer p6 = new HockeyPlayer("Eddie Ockenden", "Sydney Sharks", "Australia", "Midfielder", 55, 14.0);
		HockeyPlayer p7 = new HockeyPlayer("Thierry Brinkman", "Amsterdam Eagles", "Netherlands", "Forward", 82, 9.5);
		HockeyPlayer p8 = new HockeyPlayer("Jeroen Hertzberger", "Amsterdam Eagles", "Netherlands", "Striker", 120, 15.0);
		HockeyPlayer p9 = new HockeyPlayer("Zach Wallace", "London Lions", "England", "Midfielder", 38, 7.0);
		HockeyPlayer p10 = new HockeyPlayer("Liam Ansell", "London Lions", "England", "Defender", 30, 6.5);
		
		List<HockeyPlayer> list = List.of(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
		
		String message = service.addMultiplePlayers(list);
		System.out.println(message);
		
		 System.out.println("\n========== PLAYERS FROM INDIA WARRIORS ==========");
		    service.findByTeamName("India Warriors")
		           .forEach(System.out::println);

		    System.out.println("\n========== PLAYERS WITH GOALS > 50 ==========");
		    service.findPlayersWithGoalsGreaterThan(50)
		           .forEach(System.out::println);

		    System.out.println("\n========== FORWARDS FROM INDIA ==========");
		    service.findByRoleAndCountry("Forward", "India")
		           .forEach(System.out::println);

		    System.out.println("\n========== PLAYERS WHOSE NAME CONTAINS 'Singh' ==========");
		    service.findByNameContains("Singh")
		           .forEach(System.out::println);

		    System.out.println("\n========== PLAYERS WITH EXPERIENCE BETWEEN 5 AND 10 YEARS ==========");
		    service.findByExperienceBetween(5, 10)
		           .forEach(System.out::println);

		    System.out.println("\n========== TOTAL PLAYERS IN INDIA WARRIORS ==========");
		    System.out.println("Count : " +
		            service.countPlayersByTeam("India Warriors"));

		    System.out.println("\n========== PLAYERS SORTED BY GOALS (DESC) ==========");
		    service.findPlayersOrderByGoalsDesc()
		           .forEach(System.out::println);

		    System.out.println("\n========== UPDATING GOALS OF PLAYER ID 101 ==========");
		    int updated = service.updateGoals(101L, 55);
		    System.out.println(updated + " player record updated.");

		    System.out.println("\n========== PLAYER NAME AND GOALS ==========");
		    service.getPlayerNameAndGoals().forEach(obj -> {
		        System.out.println("Player Name : " + obj[0]
		                         + " | Goals : " + obj[1]);
		    });

		    System.out.println("\n========== DELETING PLAYERS FROM ENGLAND ==========");
		    int deleted = service.deleteByCountry("England");
		    System.out.println(deleted + " player record(s) deleted.");
		}
		

	

}
