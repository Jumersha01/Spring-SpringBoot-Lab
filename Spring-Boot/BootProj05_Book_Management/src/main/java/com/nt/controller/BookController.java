package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Book;
import com.nt.service.BookServiceImp;

@Controller("controll")
public class BookController {
  
	
	@Autowired
    BookServiceImp service;
	
	public void addBook(Book book)throws Exception {
		System.out.println("Adding Book...");
		service.addBook(book);
	}
	
	public List<Book> retriveAllBooks() throws Exception{
		List<Book> books = new ArrayList<>();
		books=service.retriveAllBooks();
		return books;
	}
	
	public void deleteBook(int id) throws Exception  {
		service.deleteBook(id);
	}
	
	public void updateBook(Book book) throws Exception {
		service.updateBook(book);
	}
	
	
	
}
