package com.nt.sbeans;

import org.springframework.stereotype.Component;

import com.nt.comp.PaymentStrategy;

@Component
public final class CashPayment implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		System.out.println(" Payment  done  using  cash Payment "+amount);

	}

}
