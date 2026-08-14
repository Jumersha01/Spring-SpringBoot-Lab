package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Bus;
import com.nt.repository.BusDAO;

@Service("busService")
public class BusService {
    
	@Autowired
	BusDAO dao;
	public void addBus(Bus bus) throws Exception{
		dao.insertBus(bus);
	}
	
	public List<Bus> retriveAllBusses()throws Exception{
		List<Bus> buses = dao.getAllBuses();
		return buses;
	}
	
}
