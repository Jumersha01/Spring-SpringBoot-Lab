package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.BookController;
import com.nt.model.Book;

@SpringBootApplication
public class BootProj05BookManagementApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx =SpringApplication.run(BootProj05BookManagementApplication.class, args);Scanner sc = new Scanner(System.in)){
		  BookController control = ctx.getBean("controll",BookController.class);	
		  
		  while(true) {
				System.out.println("Choose What you want to do:\n1.Insert a new product.\n2.Retrieve all products.\n3.Delete a product by ID.\n4.Update product details.\n5.Exit: ");
				int choice = sc.nextInt();
				
				switch(choice) {
				case 1:{
					 System.out.println("Enter Book Id: ");
					 int id = sc.nextInt();
					 
					 System.out.println("Enter Book Title: ");
					 String title=sc.next();
					 
					 System.out.println("Enter Book Author: ");
					 String author =sc.next();
					 
					 System.out.println("Enter Book Price: ");
					 double price = sc.nextDouble();
					 
					 
					Book book = new Book(id,title,author,price);
					 control.addBook(book);
					break;
				}
				case 2:{
					
					List<Book> books = control.retriveAllBooks();
					for(Book book:books) {
						System.out.println("Book Title: "+book.getTitle()+"\nBook Id: "+book.getBookId()+"\nBook Authro: "+book.getAuthor()+"\nBook Price: "+book.getPrice());
						System.out.println("------------------------------------------------");
					}
					
					break;
					
				}
				case 3:{
					
					System.out.println("Enter Book id to delete Book: ");
					int id = sc.nextInt();
					control.deleteBook(id);
					break;
				}
				 
				case 4:{
					 System.out.println("Enter Book Id: Which Book You want to modify: ");
					 int id = sc.nextInt();
					 
					 System.out.println("Enter new Book title: for change");
					 String title=sc.next();
					 
					 System.out.println("Enter new Book Author: for change");
					 String author=sc.next();
					 
					 System.out.println("Enter new Book Price: for change");
					 double price = sc.nextDouble();
					 
					 
					 Book book= new Book(id,title,author,price);
					 control.updateBook(book);
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
