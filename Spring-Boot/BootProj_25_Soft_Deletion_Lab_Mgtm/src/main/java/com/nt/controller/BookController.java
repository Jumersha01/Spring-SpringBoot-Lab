package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Book;
import com.nt.repository.BookMgmtRepository;

@RestController
@RequestMapping("/book-api")
public class BookController {

	@Autowired
	private BookMgmtRepository repo;

	@PostMapping("/add")
	public String addBook(@RequestBody Book book) {
		int id = repo.save(book).getId();
		return "Book Saved with id: " + id;
	}

	@DeleteMapping("/delete")
	public String delete(@RequestParam int id) {
		repo.deleteById(id);
		return id + "Book id deleted: (Moved to Trash)";
	}

	@GetMapping("/findAll")
	public ResponseEntity<List<Book>> getAllBook() {
		List<Book> bookList = repo.findAll();
		return new ResponseEntity<List<Book>>(bookList, HttpStatus.OK);

	}

}
