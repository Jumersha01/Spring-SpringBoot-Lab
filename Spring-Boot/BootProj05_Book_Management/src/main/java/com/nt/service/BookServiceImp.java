package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Book;
import com.nt.repository.IBookDAO;

@Service("serv")
public class BookServiceImp implements IBookService {
	@Autowired
	IBookDAO dao;

	@Override
	public void addBook(Book book) throws Exception {
		dao.insertBook(book);
       
	}

	@Override
	public List<Book> retriveAllBooks() throws Exception {
		List<Book> books = new ArrayList<>();
		books=dao.getAllBooks();
		return books;
		
	}

	@Override
	public void deleteBook(int bookId) throws Exception {
		
		dao.deleteBook(bookId);

	}

	@Override
	public void updateBook(Book book) throws Exception {
		dao.updateBook(book);

	}

}
