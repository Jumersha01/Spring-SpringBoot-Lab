package com.nt.NotificationServiceFactorySystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.comp.NotificationService;
import com.nt.config.AppConfig;
import com.nt.sbeans.NotificationFactoryBean;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
        	NotificationFactoryBean bean = ctx.getBean(NotificationFactoryBean.class);
        	NotificationService service = bean.getObject();
        	service.sendNotification();
        	service.notificationDetails();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
