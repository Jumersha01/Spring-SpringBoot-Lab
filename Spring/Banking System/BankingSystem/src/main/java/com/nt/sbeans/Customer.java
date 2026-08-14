package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.comp.Bank;
import com.nt.comp.BankFactory;

@Component("cs")
public class Customer {
private int customerId;
private String customerName;
private Bank bank;

@Autowired
BankFactory bankFactory;

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public void setBank(String bankType) {
	this.bank = bankFactory.createBank(bankType);
}
public void deposit(double amount) {
	this.bank.deposit(amount);
}
public void withdraw(double amount) {
	System.out.println(bank.withdraw(amount));
}

public void displayDetails() {
	System.out.println("Customer Details: \nCustomer Name: "+this.customerName+"\nCustomer Id: "+this.customerId+"\nCustomer Bank Balance: "+this.bank.toString());
}

}
