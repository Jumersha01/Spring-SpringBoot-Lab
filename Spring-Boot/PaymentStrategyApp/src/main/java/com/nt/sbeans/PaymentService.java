package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

	@Autowired
	UpiPayment upiPayment;

	@Autowired
	CardPayment cardPayment;

	@Autowired
	CashPayment cashPayment;

	public void makePayment(String type, double amount) {
		if (type.equalsIgnoreCase("upi"))
			upiPayment.pay(amount);
		else if (type.equalsIgnoreCase("card"))
			cardPayment.pay(amount);
		else if (type.equalsIgnoreCase("cashPayment"))
			cashPayment.pay(amount);
		else
			throw new IllegalArgumentException("no matching type found");
	}

}
