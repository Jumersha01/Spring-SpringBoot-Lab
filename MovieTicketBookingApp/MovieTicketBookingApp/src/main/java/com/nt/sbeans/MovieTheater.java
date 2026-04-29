package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mt")
public class MovieTheater {

	@Value("Infinity Vision")
	private String theaterName;
	
	@Value("Avengers Doomsday")
	private String movieName;
	
	@Value("2000")
	private int ticketPrice;
	
	@Value("58")
	private int availableSeats;
	
	@Value("true")
	private boolean isInfinityAvailabe;
	
	public String bookTickets(int tickets) {
		String message = null;
		if(tickets>this.availableSeats) {
			message="Sorry "+tickets+" seats are not Available\nAvailable seats are:"+this.availableSeats;
		}
		else {
			message = tickets+" booked \n Available seats are: "+((this.availableSeats)-tickets);
		}
		return message;
	}
	
	public void showMovieDetails() {
		System.out.println("Movie Details: \n" +"Movie name:"+this.movieName+"\nMovie ticket price: "+this.ticketPrice);
		
	}
	
	

	public String getTheaterName() {
		return theaterName;
	}

	public String getMovieName() {
		return movieName;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public boolean isInfinityAvailabe() {
		return isInfinityAvailabe;
	}
	
	
}
