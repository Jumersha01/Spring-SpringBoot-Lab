package com.nt.sbeans;

import java.util.Map;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.nt.comp.VehicleService;

@Component

public class VehicleFactoryBean implements FactoryBean<VehicleService> {

	@Autowired
	Map<String ,VehicleService> service;
	@Value("${v.type}")
	private String type;
	@Override
	public  VehicleService getObject() throws Exception {
		VehicleService service = this.service.get(type.toLowerCase());
		return service;
		
	}

	@Override
	public @Nullable Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

}
