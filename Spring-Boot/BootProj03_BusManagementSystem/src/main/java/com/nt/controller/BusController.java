package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Bus;
import com.nt.service.BusService;

@Controller("busController")
public class BusController {
	
	
	
	@Autowired
	BusService service;
	
	public void addBus(Bus bus) throws Exception {
		service.addBus(bus);
	}
	
	public List<Bus> retriveAllBusses() throws Exception{
		List<Bus> buses = service.retriveAllBusses();
		return buses;
	}
	

}
