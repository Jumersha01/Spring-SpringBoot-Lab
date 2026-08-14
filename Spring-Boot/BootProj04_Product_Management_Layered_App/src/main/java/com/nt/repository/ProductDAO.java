package com.nt.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Product;

@Repository("dao")
public class ProductDAO {
	private static final String INSERT_QUERY = "insert into product values(?,?,?,?)";
	private static final String DELETE_QUERY = "DELETE FROM product WHERE PRODUCTID = ?";
	private static final String RETRIVE_QUERY = "SELECT PRODUCTID, PRODUCTNAME, DESCRIPTION, PRICE FROM PRODUCT";
	private static final String UPDATE_QUERY="UPDATE PRODUCT SET PRODUCTNAME=?, DESCRIPTION=?, PRICE=? WHERE PRODUCTID=?";
	
	
	@Autowired
	DataSource ds;

	public void insertPorduct(Product product) throws Exception {
		try (Connection con = ds.getConnection()) {
			PreparedStatement st = con.prepareStatement(INSERT_QUERY);
			
			st.setInt(1, product.getProductId());
			st.setString(2, product.getProductName());
			st.setString(3, product.getDescription());
			st.setDouble(4, product.getPrice());

			int inserted = st.executeUpdate();
			if (inserted >= 1) {
				System.out.println("Your data succesfully inserted");
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public List<Product> retriveAllProduct() throws Exception {
		List<Product> products = new ArrayList<Product>();

		try (Connection con = ds.getConnection()) {
			PreparedStatement ps = con.prepareStatement(RETRIVE_QUERY);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1) ;
				String name = rs.getString(2);
				String description = rs.getString(3);
				double price = rs.getDouble(4);
				Product product = new Product(id, name, description, price);
				products.add(product);
			}
			return products;

		} catch (Exception e) {
			throw e;
		}

	}

	public void deleteProduct(int pid) throws Exception {
		try (Connection con = ds.getConnection()) {
			PreparedStatement st = con.prepareStatement(DELETE_QUERY);
			st.setInt(1, pid);

			int deleted = st.executeUpdate();
			if (deleted >= 1) {
				System.out.println("Your data has been deleted Succesfully.");
			}

		} catch (Exception e) {
			throw e;
		}

	}
	
	public void updateProduct(Product product) throws Exception {
		try(Connection con = ds.getConnection()){
			PreparedStatement st = con.prepareStatement(UPDATE_QUERY);
			
			st.setString(1, product.getProductName());
			st.setString(2, product.getDescription());
			st.setDouble(3, product.getPrice());
			st.setInt(4, product.getProductId());
			
			int updated = st.executeUpdate();
			if(updated>=1) {
				System.out.println("Your data has been updated succesfully");
			}
			
			
		}
		catch(Exception e) {
			throw e;
		}
	}

}
