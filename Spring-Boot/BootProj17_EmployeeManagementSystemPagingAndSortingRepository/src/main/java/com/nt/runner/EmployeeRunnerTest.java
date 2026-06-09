package com.nt.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.EmployeeController;
import com.nt.entity.Employee;

@Component
public class EmployeeRunnerTest implements CommandLineRunner {
	
	@Autowired
	private EmployeeController controller ;

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.Get Employee With Pagination:\n2. View Employees Sorted by Salary: \n3. View Employees Sorted by Name: \n4. Add Multiple Employee: \n5.Exit: ");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
			case 1:{
				System.out.println("Enter page no: ");
				int pageNO = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter page size: ");
				int pageS = Integer.parseInt(sc.nextLine());
				Iterable<Employee> emps=controller.getEmployeByPage(pageNO, pageS);
			    StreamSupport.stream(emps.spliterator(), false).forEach(System.out::println);
				break;
			}
			case 2:{
				Iterable<Employee> emps=controller.getEmployeeSortedBySalary();
				StreamSupport.stream(emps.spliterator(), false).forEach(System.out::println);
				break;
			}
			case 3:{
				Iterable<Employee> emps=controller.getEmployeeSortedByName();
				StreamSupport.stream(emps.spliterator(), false).forEach(System.out::println);
				break;
			}
			case 4:{
				System.out.println("Enter how many Employee Do You Want to Add:");
				int noOfEmp = Integer.parseInt(sc.nextLine());

				List<Employee> list = new ArrayList<>(noOfEmp);

				for (int i = 0; i < noOfEmp; i++) {

					System.out.println("Enter Employee Id: ");
					Integer id = Integer.parseInt(sc.nextLine());

					System.out.println("Enter Employee Name: ");
					String name = sc.nextLine();

					System.out.println("Enter Employee Department: ");
					String department = sc.nextLine();

					System.out.println("Enter Employee Salary: ");
					Double salary = Double.parseDouble(sc.nextLine());

					Employee emp = new Employee(id, name, department, salary);

					list.add(emp);
				}
				String message = controller.addMultipleEmployee(list);
				System.out.println(message);
				break;
			}
			case 5:{
				System.out.println("Come again:");
				System.exit(0);
			}
			default:{
				System.out.println("Choose valid option:");
			}
			}
		}
	}

}
