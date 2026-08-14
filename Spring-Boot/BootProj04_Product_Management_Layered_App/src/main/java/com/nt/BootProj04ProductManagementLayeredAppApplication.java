package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.ProductController;
import com.nt.model.Product;

@SpringBootApplication
public class BootProj04ProductManagementLayeredAppApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootProj04ProductManagementLayeredAppApplication.class, args);Scanner sc = new Scanner(System.in)) {
			ProductController pr =ctx.getBean("controll",ProductController.class);
			
			while(true) {
				System.out.println("Choose What you want to do:\n1.Insert a new product.\n2.Retrieve all products.\n3.Delete a product by ID.\n4.Update product details.\n5.Exit: ");
				int choice = sc.nextInt();
				
				switch(choice) {
				case 1:{
					 System.out.println("Enter Id: ");
					 int id = sc.nextInt();
					 
					 System.out.println("Enter Name: ");
					 String name=sc.next();
					 
					 System.out.println("Enter description: ");
					 String description =sc.next();
					 
					 System.out.println("Enter Price: ");
					 double price = sc.nextDouble();
					 
					 
					 Product product = new Product(id,name,description,price);
					 pr.addProduct(product);
					break;
				}
				case 2:{
					System.out.println("Retrived Data: ");
					 
					List<Product> products = pr.retrieveAllProducts();
					for(Product product:products) {
						System.out.println("Product Name: "+product.getProductName()+"\nProduct Id: "+product.getProductId()+"\nProduct Description: "+product.getDescription()+"\nProduct Price: "+product.getPrice());
						System.out.println("------------------------------------------------");
					}
					
					break;
					
				}
				case 3:{
					System.out.println("Deleting Data");
					
					System.out.println("Enter product id to delete product: ");
					int id = sc.nextInt();
					pr.deleteProduct(id);
					break;
				}
				 
				case 4:{
					 System.out.println("Enter new Product Id: Which Product You want to modify: ");
					 int id = sc.nextInt();
					 
					 System.out.println("Enter new Product Name: for change");
					 String name=sc.next();
					 
					 System.out.println("Enter new Product Description: for change");
					 String description =sc.next();
					 
					 System.out.println("Enter new Product Price: for change");
					 double price = sc.nextDouble();
					 
					 
					 Product product = new Product(id,name,description,price);
					 pr.updateProduct(product);
					break;
				}
				case 5:{
					System.err.println("Thank you visit again: ");
					System.exit(0);
				}
				default :{
					System.err.println("Choose valid option");
				}
				
					
				}
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
