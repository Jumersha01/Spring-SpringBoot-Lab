package com.nt.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.IProductController;
import com.nt.entity.Product;
import com.nt.repository.IProductRespository;

@Component
public class ConsoleApplicationRunner implements CommandLineRunner {
	private final IProductRespository IProductRespository;

	Scanner sc = new Scanner(System.in);

	@Autowired
	IProductController controller;

	ConsoleApplicationRunner(IProductRespository IProductRespository) {
		this.IProductRespository = IProductRespository;
	}

	@Override
	public void run(String... args) throws Exception {
		while(true) {
			System.out.println(
					"1.Insert Product:\n2.Retrive Products:\n3.Find Product By Id:\n4.Delete Product By Id:\n5.Exit:\n");
			
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1: {
				System.out.println("Enter product id: ");
				Long id = Long.parseLong(sc.nextLine());
				
				System.out.println("Enter product name: ");
				String name = sc.nextLine();

				System.out.println("Enter product description: ");
				String description = sc.nextLine();

				System.out.println("Enter product price: ");
				Double price = Double.parseDouble(sc.nextLine());
				

				Product p1 = new Product(id, name, description, price);

				controller.inserProduct(p1);
				break;
			}
			case 2: {
				System.out.println("Retriving All Products: ");
				Iterable<Product> products = controller.retrieveAllProducts();
				for (Product pr : products) {
					System.out.println(pr);
				}
				break;
			}
			case 3: {
				System.out.println("Enter Product id: ");
				Long id =Long.parseLong(sc.nextLine());

				System.out.println("Product got fetched :" + controller.findProductById(id));
				break;
			}
			case 4: {
				System.out.println("Enter Product id: ");
				Long id =Long.parseLong(sc.nextLine());
	              
				controller.deleteProductById(id);
				System.out.println("Product got Deleted...");
				break;
			}
			case 5: {
				System.out.println("Thank you visit Again...");
				System.exit(0);
			}
			default:{
				System.out.println("Please choose a valid option: ");
			}
			}
		}
	}

}
