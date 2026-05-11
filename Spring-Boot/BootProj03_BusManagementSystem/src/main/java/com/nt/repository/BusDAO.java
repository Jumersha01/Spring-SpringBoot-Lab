package com.nt.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Bus;

@Repository("dao")
public class BusDAO {
	String query1 = "insert into bus values(?,?,?,?,?)";
	String query2 = "select BUSNO,  BUSCOLOUR , TICKETPRICE , STARTFROM , ENDTO from bus";

	@Autowired
	private DataSource ds;

	public void insertBus(Bus bus) throws Exception {
		try (Connection con = ds.getConnection()) {

			PreparedStatement ps = con.prepareStatement(query1);
			ps.setString(1, bus.getBusNo());
			ps.setString(2, bus.getBusColour());
			ps.setString(3, bus.getTicketPrice());
			ps.setString(4, bus.getStartsFrom());
			ps.setString(5, bus.getEndTo());

			int execute = ps.executeUpdate();
			if (execute >= 1) {
				System.out.println("Date entered succesfully");
			} else {
				System.out.println("Data aint entered");
			}

		} catch (Exception e) {
			throw e;
			

		}
	}

	public List<Bus> getAllBuses() throws Exception {

		List<Bus> buses = new ArrayList<Bus>();
		
		try (Connection con = ds.getConnection()) {

			PreparedStatement ps = con.prepareStatement(query2);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String busNo = rs.getString("BUSNO");
				String busColour = rs.getString("BUSCOLOUR");
				String busPrice = rs.getString("TICKETPRICE");
				String startFrom = rs.getString("STARTFROM");
				String endTo = rs.getString("ENDTO");
				Bus bus = new Bus(busNo,busColour,busPrice,startFrom,endTo);
				buses.add(bus);
			}
		} catch (Exception e) {
			
			throw e;
		}

		return buses;

	}
}
