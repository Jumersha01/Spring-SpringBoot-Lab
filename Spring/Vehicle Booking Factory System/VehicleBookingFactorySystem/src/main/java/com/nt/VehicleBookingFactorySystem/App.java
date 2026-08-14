package com.nt.VehicleBookingFactorySystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.comp.VehicleService;
import com.nt.conifg.AppConfig;
import com.nt.sbeans.VehicleFactoryBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
      try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
    	  VehicleFactoryBean bean = ctx.getBean(VehicleFactoryBean.class);
    	 VehicleService service = bean.getObject();
    	 service.bookVehicle();
    	 service.vehicleInfo();
      }
    }
}
