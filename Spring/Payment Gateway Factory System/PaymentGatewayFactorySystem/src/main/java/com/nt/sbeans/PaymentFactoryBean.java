package com.nt.sbeans;

import java.util.Map;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.comp.PaymentService;

@Component("ps")
public class PaymentFactoryBean implements FactoryBean<PaymentService> {

	@Autowired
    Map<String,PaymentService> service;
	
	@Value("googlePayService")
	private String type;
	
	
	@Override
	public PaymentService getObject() throws Exception {
		
		return service.get(type);
	}

	@Override
	public  Class<?> getObjectType() {
		
		return null;
	}

}
