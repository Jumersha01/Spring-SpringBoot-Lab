package com.nt.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Book;

import ch.qos.logback.core.net.SyslogOutputStream;

@Repository("dao")
public class IBookDAOImp implements IBookDAO {
	private static final String INSERT_QUERY = "Insert into book values(?,?,?,?)";
	private static final String RETRIVE_QUERY = "Select  BOOK_ID,TITLE,AUTHOR,PRICE from book";
	private static final String DELETE_QUERY = "delete from book where  BOOK_ID =?";
	private static final String UPDATE_QUERY = "UPDATE book SET TITLE=?, AUTHOR=?, PRICE=? WHERE BOOK_ID=?";

	@Autowired
	 DataSource ds;

	@Override
	public void insertBook(Book book) throws Exception {
		try (Connection con = ds.getConnection()) {

			PreparedStatement st = con.prepareStatement(INSERT_QUERY);

			st.setInt(1, book.getBookId());
			st.setString(2, book.getTitle());
			st.setString(3, book.getAuthor());
			st.setDouble(4, book.getPrice());

			int inserted = st.executeUpdate();

			if (inserted >= 1) {
				System.out.println("Data has been inserted...");
			}

		} catch (Exception e) {
			throw e;
		}

	}

	@Override
	public List<Book> getAllBooks() throws Exception {
		List<Book> list = new ArrayList<>();
		try (Connection con = ds.getConnection()) {

			PreparedStatement st = con.prepareStatement(RETRIVE_QUERY);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				int id = rs.getInt(1);
				String title = rs.getString(2);
				String author = rs.getString(3);
				double price = rs.getDouble(4);
				Book book = new Book(id, title, author, price);
				list.add(book);
			}

			return list;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void deleteBook(int bookId) throws Exception {
		try (Connection con = ds.getConnection()) {
			PreparedStatement st = con.prepareStatement(DELETE_QUERY);
			st.setInt(1, bookId);

			int deleted = st.executeUpdate();

			if (deleted >= 1) {
				System.out.println("Book is Deleted...");
			}

		} catch (Exception e) {
			throw e;
		}

	}

	@Override
	public void updateBook(Book book) throws Exception {
		try (Connection con = ds.getConnection()) {
			
			PreparedStatement st = con.prepareStatement(UPDATE_QUERY);
			
			st.setString(1,book.getTitle());
			st.setString(2, book.getAuthor());
			st.setDouble(3, book.getPrice());
			st.setInt(4, book.getBookId());
			
			int updated = st.executeUpdate();
			
			if(updated>=1) {
				System.out.println("Book Updated...");
			}

		} catch (Exception e) {
			throw e;
		}

	}

}
