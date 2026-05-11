package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.BusController;
import com.nt.model.Bus;

@SpringBootApplication
public class BootProj03BusManagementSystemApplication {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(BootProj03BusManagementSystemApplication.class,
				args)) {
			BusController controller = ctx.getBean("busController", BusController.class);

			// Taking input from user based on the choice:

			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("1 For Entering Bus: \n2 for Retriving Bus: \n3 Exit: ");
				int choice = sc.nextInt();
				switch (choice) {
				case 1: {
					//Adding Data
					System.out.println("Enter bus no:");
					String busNo = sc.next();

					System.out.println("Enter bus colour:");
					String colour = sc.next();

					System.out.println("Enter bus price:");
					String price = sc.next();

					System.out.println("Enter bus start from:");
					String start = sc.next();

					System.out.println("Enter bus end to");
					String end = sc.next();
					Bus bus = new Bus(busNo, colour, price, start, end);
					controller.addBus(bus);
					break;

				}
				case 2: {
					//Retriving Data
					List<Bus> buses = controller.retriveAllBusses();

					for (Bus bus : buses) {
						System.out.println("Bus NO: " + bus.getBusNo().toUpperCase() + "\nBus Color: "
								+ bus.getBusColour().toUpperCase() + "\nBus Price: " + bus.getTicketPrice().toUpperCase()
								+ "\nBus Start From: " + bus.getStartsFrom().toUpperCase() + "\nBus End To: "
								+ bus.getEndTo().toUpperCase());
						  System.out.println("---------------------------------");
					}
					break;

				}
				case 3:{
					System.exit(0);
				}
				default: {
					System.err.println("Choose a valid option");
				}

				}
			}

		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
