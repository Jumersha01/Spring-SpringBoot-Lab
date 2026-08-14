package com.nt.model;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Bus implements Serializable {

	String busNo;
	String busColour;
	String ticketPrice;
	String startsFrom;
	String endTo;

	public Bus(String busNo, String busColour, String ticketPrice, String startsFrom, String endTo) {
		this.busNo = busNo;
		this.busColour = busColour;
		this.ticketPrice = ticketPrice;
		this.startsFrom = startsFrom;
		this.endTo = endTo;
	}

}
