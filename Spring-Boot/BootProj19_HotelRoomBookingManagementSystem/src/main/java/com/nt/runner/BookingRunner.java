package com.nt.runner;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Booking;
import com.nt.repository.BookingRepository;
@Component
public class BookingRunner implements CommandLineRunner {
	
    @Autowired
	private BookingRepository repo;
    
    
	@Override
	public void run(String... args) throws Exception {
	   Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Chennai or Suite.\n 2. Amount 5000-15000.\n 3. Days 2-5. 4. Confirmed or Hyderabad.\n 5. Dates 2026-01-01 to 2026-03-31. 6. Anita or Cancelled.\n 7. Deluxe or Pending.\n 8. IDs 101-110\n 9.Exit");
			int choice = Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1:{
				System.out.println("Enter City Name:");
				String city = sc.nextLine();
				System.out.println("Enter Room Type: ");
				String roomType=sc.nextLine();
				List<Booking> bookings =repo.findByCityOrRoomType(city, roomType);
				if(bookings.isEmpty()) {
				    System.out.println("No records found...");
				   
				} else {
				    bookings.forEach(System.out::println);
				}
			}
			}
		}
		

	}

}
