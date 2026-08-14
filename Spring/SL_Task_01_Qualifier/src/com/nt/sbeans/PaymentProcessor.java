package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("pp")
public class PaymentProcessor {

@Autowired
@Qualifier("gp")
public PaymentService paymentService;



}
