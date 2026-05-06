package com.nt.EncryptionAlgorithmFactory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.comp.EncryptionService;
import com.nt.config.AppConfig;
import com.nt.sbeans.EncryptionFactoryBean;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
       try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
    	   EncryptionFactoryBean bean = ctx.getBean(EncryptionFactoryBean.class);
    	   EncryptionService object = bean.getObject();
object.encrypt();
object.decrypt();

    	   
       }
       catch(Exception e) {
    	   e.printStackTrace();
       }
    }
}
