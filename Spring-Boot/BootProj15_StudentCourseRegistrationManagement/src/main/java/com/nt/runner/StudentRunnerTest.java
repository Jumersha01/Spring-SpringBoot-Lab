package com.nt.runner;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.StudenController;
import com.nt.entity.Student;

@Component
public class StudentRunnerTest implements CommandLineRunner {
	@Autowired
	StudenController controller;

	@Override

	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. Register Student:\n2. View All Students:\n3. Search By ID:\n"
					+ "4. Update Course:\n5. Delete Student:\n6. Count Students:\n" + "7. Exit");
			int choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 1: {

				System.out.println("Enter Student id: ");
				Integer id = Integer.parseInt(sc.nextLine());

				System.out.println("Enter Student Name: ");
				String name = sc.nextLine();

				System.out.println("Enter Course Name: ");
				String course = sc.nextLine();

				System.out.println("Enter Course Fee: ");
				Double fee = Double.parseDouble(sc.nextLine());
				
				System.out.println("Enter the Institute Name: ");
				String institute = sc.nextLine();

				
				if (name.isBlank() || name.isEmpty()) {
					System.out.println("Student name should not be empty: ");
					System.exit(0);
					
				} else if (institute.isBlank() || institute.isEmpty()) {
					System.out.println("Institute name should not be empty:");
					System.exit(0);
				
				} else if (fee <= 0) {
					System.out.println("Course Fee must be greater than 0:");
					System.exit(0);
					
				}
				else {
					Student s = new Student(id,name,course,fee,institute);
					controller.registerStudent(s);
				}

				break;

			}
			case 2: {
				System.out.println("Viwing all Student:");
				Iterable<Student> students = controller.getAllStudent();
				for (Student student : students) {
					System.out.println(student);
				}
				break;
			}
			case 3: {
				System.out.println(" Enter Student  Id: ");
				Integer id = Integer.parseInt(sc.nextLine());
				Optional<Student> s = controller.getStudentById(id);
				System.out.println("Student search by Id: " + s);
				break;
			}
			case 4: {
				System.out.println("Updatating Course Re-Enter details: ");

				System.out.println("Enter Student id: ");
				Integer id = Integer.parseInt(sc.nextLine());

				System.out.println("Enter Student Name: ");
				String name = sc.nextLine();

				System.out.println("Enter Course Name: ");
				String course = sc.nextLine();

				System.out.println("Enter Course Fee: ");
				Double fee = Double.parseDouble(sc.nextLine());
                System.out.println("Enter Insitute Name:");
				String institute = sc.nextLine();

				

					Student s = new Student(id, name, course, fee, institute);
					System.out.println(controller.updateStudent(s));
					break;
					
				}
			
			case 5: {
				System.out.println("Deleting Student: ");

				System.out.println("Enter Student ID:");
				Integer id = Integer.parseInt(sc.nextLine());

				Optional<Student> opt = controller.getStudentById(id);

				if (opt.isPresent()) {
					controller.deleteStudent(opt.get());
					System.out.println("Student deleted successfully.");
				} else {
					System.out.println("Student not found with ID: " + id);
				}

				break;
			}

			case 6: {
				System.out.println("Counting Students: ");
				Long count = controller.countStudents();
				System.out.println("Student count is: " + count);
				break;
			}
			case 7: {
				System.out.println("Exiting the app\n Thank you:");
				System.exit(0);
			}
			default:{
				System.err.println("Ivalid choice please choose the valid one: ");
				
			}
			}
		}
		

	}

}
