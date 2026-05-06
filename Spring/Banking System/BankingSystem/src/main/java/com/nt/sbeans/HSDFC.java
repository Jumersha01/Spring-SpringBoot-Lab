package com.nt.sbeans;

import org.springframework.stereotype.Component;

import com.nt.comp.Bank;
@Component
public class HSDFC implements Bank {

	private double amount;
	@Override
	public double getAmount() {
		
		return this.amount;
	}

	@Override
	public void setAmount(double amount) {
		this.amount=amount;

	}

	@Override
	public String deposit(double amount) {
		
		 return " Amount "+(amount)+" added succesfully After adding : "+(this.amount+=amount);
	}

	@Override
	public String withdraw(double amount) {
		String errorMessage = null;
		if(amount>this.amount) {
			errorMessage = "Insufficient balance";
		}
		else {
			errorMessage=amount+" Succusfully withrawed now: "+(this.amount-amount);
		}
		return errorMessage;
	}

	@Override
	public String toString() {
		return "HSDFC [amount=" + amount + "]";
	}
	

}
