package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.comp.Bank;
import com.nt.comp.BankFactory;
@Component("bf")
public class ConcreteBankFactory implements BankFactory{

	@Autowired
	SBI sbi;
	
	@Autowired
	HSDFC hdfc;
	
	@Override
	public Bank createBank(String bankType) {
		Bank bank = null;
		if(bankType.equalsIgnoreCase("sbi")) {
			bank = new SBI();
		}
		else if(bankType.equalsIgnoreCase("hdfc")) {
			bank = new HSDFC();
		}
		return bank;
	}
}
