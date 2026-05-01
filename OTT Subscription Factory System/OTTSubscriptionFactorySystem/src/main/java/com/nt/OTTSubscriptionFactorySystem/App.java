package com.nt.OTTSubscriptionFactorySystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.comp.SubscriptionService;
import com.nt.config.AppConfig;
import com.nt.sbeans.SubscriptionFactoryBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
    	   SubscriptionFactoryBean bean = ctx.getBean(SubscriptionFactoryBean.class);
    	   SubscriptionService sr = bean.getObject();
    	   sr.activatePlane();
    	   sr.showPlaneDetails();
       }
       catch(Exception e) {
    	   e.printStackTrace();
       }
    }
}
