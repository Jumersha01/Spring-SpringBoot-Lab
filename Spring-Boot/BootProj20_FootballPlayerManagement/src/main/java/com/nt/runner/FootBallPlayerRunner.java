package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.FootballPlayer;
import com.nt.service.FootballPlayerService;

@Component
public class FootBallPlayerRunner implements CommandLineRunner {

	@Autowired
	private FootballPlayerService service;
	
	@Override
	public void run(String... args) throws Exception {
		FootballPlayer p1 = new FootballPlayer("Lionel Messi", "Argentina",
		        "Inter Miami", "Forward", 5000000.0, 10);
		p1.setPlayerId(101);

		FootballPlayer p2 = new FootballPlayer("Cristiano Ronaldo", "Portugal",
		        "Al Nassr", "Forward", 5500000.0, 7);
		p2.setPlayerId(102);

		FootballPlayer p3 = new FootballPlayer("Kylian Mbappe", "France",
		        "Real Madrid", "Forward", 4500000.0, 9);
		p3.setPlayerId(103);

		FootballPlayer p4 = new FootballPlayer("Kevin De Bruyne", "Belgium",
		        "Manchester City", "Midfielder", 4000000.0, 17);
		p4.setPlayerId(104);

		FootballPlayer p5 = new FootballPlayer("Virgil van Dijk", "Netherlands",
		        "Liverpool", "Defender", 3500000.0, 4);
		p5.setPlayerId(105);

		FootballPlayer p6 = new FootballPlayer("Erling Haaland", "Norway",
		        "Manchester City", "Forward", 4800000.0, 9);
		p6.setPlayerId(106);

		FootballPlayer p7 = new FootballPlayer("Luka Modric", "Croatia",
		        "Real Madrid", "Midfielder", 3200000.0, 10);
		p7.setPlayerId(107);

		FootballPlayer p8 = new FootballPlayer("Neymar Jr", "Brazil",
		        "Santos", "Forward", 4200000.0, 11);
		p8.setPlayerId(108);

		FootballPlayer p9 = new FootballPlayer("Jude Bellingham", "England",
		        "Real Madrid", "Midfielder", 3800000.0, 5);
		p9.setPlayerId(109);

		FootballPlayer p10 = new FootballPlayer("Manuel Neuer", "Germany",
		        "Bayern Munich", "Goalkeeper", 3000000.0, 1);
		p10.setPlayerId(110);
		
//		List<FootballPlayer> list = List.of(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
//		String message = service.addPlayer(list);
//		System.out.println(message);
     
	

		    System.out.println("\n================ FIND BY CLUB ================\n");
		    service.findByClub("Real Madrid")
		           .forEach(System.out::println);

		    System.out.println("\n================ SALARY > 4000000 ================\n");
		    service.findBySalaryGreaterThan(4000000.0)
		           .forEach(System.out::println);

		    System.out.println("\n================ POSITION & COUNTRY ================\n");
		    service.findByPositionAndCountry("Forward", "France")
		           .forEach(System.out::println);

		    System.out.println("\n================ NAME STARTS WITH 'L' ================\n");
		    service.findByPlayerNameStartingWith("L")
		           .forEach(System.out::println);

		    System.out.println("\n================ JERSEY NUMBER BETWEEN 5 AND 10 ================\n");
		    service.findByJerseyNumberBetween(5, 10)
		           .forEach(System.out::println);

		    System.out.println("\n================ COUNT BY COUNTRY ================\n");
		    Long count = service.countByCountry("Argentina");
		    System.out.println("Number of Players from Argentina : " + count);

		    System.out.println("\n================ ORDER BY SALARY DESC ================\n");
		    service.findAllByOrderBySalaryDesc()
		           .forEach(System.out::println);

		    System.out.println("\n================ UPDATE SALARY ================\n");
		    int updated = service.updateSalary(101L, 6500000.0);
		    System.out.println("No. of Records Updated : " + updated);

		    System.out.println("\n================ DELETE BY CLUB ================\n");
		    int deleted = service.deleteByClub("Santos");
		    System.out.println("No. of Records Deleted : " + deleted);

		    System.out.println("\n================ PLAYER NAME & CLUB ================\n");
		    List<Object[]> list1 = service.getPlayerNameAndClub();

		    for (Object[] obj : list1) {
		        System.out.println(
		                "Player Name : " + obj[0] +
		                " | Club : " + obj[1]);
		    }
		}
		
	}


