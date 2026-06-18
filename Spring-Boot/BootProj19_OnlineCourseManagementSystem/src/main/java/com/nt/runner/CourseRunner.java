package com.nt.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.CourseService;

@Component
public class CourseRunner implements CommandLineRunner {
	Scanner sc = new Scanner(System.in);
	@Autowired
	private CourseService service;

	@Override
	public void run(String... args) throws Exception {
		while (true) {
			System.out.println(
					"Operation 1: Display all courses in the Java category. \nOperation 2: Display all courses taught by Rahul Sharma. \nOperation 3: Display all courses with price less than 2000. \nOperation 4: Display all courses with price greater than 5000. \nOperation 5: Display all courses having duration greater than 40 hours. \nOperation 6: Display all courses having rating greater than or equal to 4.5. \nOperation 7: Display all courses available in English language. \nOperation 8: Display all courses whose title contains");

			int choice = Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1:{
				System.out.println("Enter category name:");
				String category=sc.nextLine();
			  
				
				
			}
			}

		}

	}

}
