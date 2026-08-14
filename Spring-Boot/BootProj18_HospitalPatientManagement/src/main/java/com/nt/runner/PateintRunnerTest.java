package com.nt.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Patient;
import com.nt.service.IPatientService;

@Component
public class PateintRunnerTest implements CommandLineRunner {
	@Autowired
	private IPatientService service;

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		try (sc) {

			while (true) {
				System.out.println("1. Paging:\n2.Add Multiple Patient\n3. Exit:");
				int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1: {
					System.out.println("Enter page no: ");
					int pageNO = Integer.parseInt(sc.nextLine());
					System.out.println("Enter page size: ");
					int pageSize = Integer.parseInt(sc.nextLine());
					Iterable<Patient> patient = service.getPatienByPage(pageNO, pageSize);
					StreamSupport.stream(patient.spliterator(), false).forEach(System.out::println);
					break;

				}
				case 2:{
					System.out.println("Enter how many patient you want to add");
					int size = Integer.parseInt(sc.nextLine());
					List<Patient> list = new ArrayList<>(size);
					 for(int i = 0;i<size;i++) {
						 System.out.println("Enter patien id:");
						 int id =Integer.parseInt(sc.nextLine());
						 
						 System.out.println("Enter patient name:");
						 String name =  sc.nextLine();
						 
						 System.out.println("Enter patient desease:");
						 String desease =sc.nextLine();
						 
						 
						 System.out.println("Enter patient age:");
						 int age = Integer.parseInt(sc.nextLine());
						 
						 Patient p = new Patient(id,name,desease,age);
						 list.add(p);
						 
					 }
					 service.addMuliplePatinet(list);
					 
					 break;
				}
				case 3:{
					System.out.println("Thank you visit Again...");
					System.exit(0);
				}
				default:{
					System.out.println("Choose valid option..s");
				}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
