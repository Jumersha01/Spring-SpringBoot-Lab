package com.nt.commans;

import org.springframework.stereotype.Component;

@Component("el")
public class ElectricEngine implements Engine {
@Override
public String getEngineType() {
	return "Electric";
}
}
