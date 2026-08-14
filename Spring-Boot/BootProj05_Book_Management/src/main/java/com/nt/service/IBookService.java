package com.nt.service;

import java.util.List;

import com.nt.model.Book;

public interface IBookService {
	
	void addBook(Book book) throws Exception;

	List<Book> retriveAllBooks() throws Exception;

	void deleteBook(int bookId) throws Exception;

	void updateBook(Book book) throws Exception;
}
