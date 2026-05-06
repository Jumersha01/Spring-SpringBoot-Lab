package com.nt.sbeans;

import java.util.Map;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.comp.NotificationService;

@Component
public class NotificationFactoryBean implements FactoryBean<NotificationService> {
    
	@Autowired
	Map<String,NotificationService> service;
	
	@Value("${s.type}")
	private String type;
	
	@Override
	public @Nullable NotificationService getObject() throws Exception {
		NotificationService service = this.service.get(type.toLowerCase());
		return service;
	}

	@Override
	public @Nullable Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return NotificationService.class;
	}

}
