package com.nt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.StreamSupport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.EmployeeController;
import com.nt.entity.Employee;

@SpringBootApplication
public class BootProj16JpaEmployeeManagementSystemApplication {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication
				.run(BootProj16JpaEmployeeManagementSystemApplication.class, args);
				Scanner sc = new Scanner(System.in)) {
			EmployeeController controller = ctx.getBean(EmployeeController.class);
			while (true) {
				System.out.println(
						"1. Add Single Employee \n2. Add Multiple Employees \n3. View Employee By Id \n4. View All Employees \n5. Check Employee Exists \n6. Count Total Employees \n7. Update Employee Details \n8. Delete Employee By Id\n9. Delete Employee Record \n10. Delete Multiple Employees\n11. Delete All Employees\n12. Exit");
				int choice = Integer.parseInt(sc.nextLine());

				switch (choice) {
				case 1: {
					System.out.println("Enter Employee Id: ");
					Integer id = Integer.parseInt(sc.nextLine());

					System.out.println("Enter Employee Name: ");
					String name = sc.nextLine();

					System.out.println("Enter Employee Department: ");
					String department = sc.nextLine();

					System.out.println("Enter Employee Salary: ");
					Double salary = Double.parseDouble(sc.nextLine());

					Employee emp = new Employee(id, name, department, salary);
					String message = controller.addSingleEmployee(emp);
					System.out.println(message);
					break;

				}
				case 2: {
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
				case 3: {
					System.out.println("Enter Employee Id: ");
					Integer id = Integer.parseInt(sc.nextLine());

					Optional<Employee> emp = controller.viewEmployeeById(id);
					System.out.println(emp);
					break;

				}
				case 4: {
					Iterable<Employee> list = controller.viewAllEmployees();
					StreamSupport.stream(list.spliterator(), false).toList().forEach(emp -> System.out.println(emp));
					break;
				}
				case 5: {
					System.out.println("Enter Employee Id:...");
					Integer id = Integer.parseInt(sc.nextLine());
					if (controller.isEmployeeExist(id)) {
						System.out.println("Employee exits with id: " + id);
					} else {
						System.out.println("Employee  does not exits with id: " + id);
					}
					break;
				}
				case 6: {
					System.out.println("Total Record : " + controller.getCount());
					break;
				}
				case 7: {
					System.out.println("Enter Employee Id: ");
					Integer id = Integer.parseInt(sc.nextLine());

					System.out.println("Enter Employee Name: ");
					String name = sc.nextLine();

					System.out.println("Enter Employee Department: ");
					String department = sc.nextLine();

					System.out.println("Enter Employee Salary: ");
					Double salary = Double.parseDouble(sc.nextLine());

					Employee emp = new Employee(id, name, department, salary);
					controller.updateEmployee(emp);
					break;
				}
				case 8: {
					System.out.println("Enter Employee Id:...");
					Integer id = Integer.parseInt(sc.nextLine());
					controller.deleteEmployeeById(id);
					break;
				}
				case 9: {
					System.out.println("Enter Employee Id:...");
					Integer id = Integer.parseInt(sc.nextLine());
					Optional<Employee> emp = controller.viewEmployeeById(id);
					controller.deleteEmployeeRecord(emp.get());
					break;
				}
				case 10: {
					System.out.println("Enter how many Employee Do You Want to Delete:");
					int noOfEmp = Integer.parseInt(sc.nextLine());

					List<Integer> list = new ArrayList<Integer>(noOfEmp);
					for (int i = 0; i < noOfEmp; i++) {
						System.out.println("Enter Employee Id: ");
						Integer id = Integer.parseInt(sc.nextLine());
						list.add(id);
					}
					Iterable<Employee> emps = controller.findAllById(list);
					controller.deleteMultipleEmployees(emps);
					break;
				}
				case 11: {
					controller.deleteAllEmployees();
					break;
					
				}
				case 12: {
					System.err.println("Thank you for visiting...");
					System.exit(0);
				}
				default: {
					System.err.println("Choose a Valid option...");
				}

				}
			}
		}
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	}
}
