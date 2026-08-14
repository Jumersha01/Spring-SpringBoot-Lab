package com.nt.repository;

import java.util.List;

import com.nt.model.Book;

public interface IBookDAO {
	
	void insertBook(Book book)throws Exception;

	List<Book> getAllBooks()throws Exception;

	void deleteBook(int bookId)throws Exception;

	void updateBook(Book book)throws Exception;

}
