package com.nt.PaymentGatewayFactorySystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.comp.PaymentService;
import com.nt.confi.AppConfig;
import com.nt.sbeans.PaymentFactoryBean;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
        	PaymentFactoryBean service = ctx.getBean(PaymentFactoryBean.class);
        	PaymentService s= service.getObject();
        	s.processPayment();
        	s.showGateWayInfo();
        	
        	
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
