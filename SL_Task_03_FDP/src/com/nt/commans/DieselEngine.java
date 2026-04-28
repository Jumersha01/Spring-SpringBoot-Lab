package com.nt.commans;

import org.springframework.stereotype.Component;

@Component("de")
public class DieselEngine implements Engine {

	@Override
	public String getEngineType() {
		
		return "Diesel";
	}

}
