package com.nt.model;

import lombok.Data;

@Data
public class Book {
	private int bookId;
	private String title;
	private String author;
	private double price;

	public Book(int bookId, String title, String author, double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}

}
