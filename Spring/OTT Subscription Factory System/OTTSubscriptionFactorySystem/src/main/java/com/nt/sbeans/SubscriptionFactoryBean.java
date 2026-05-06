package com.nt.sbeans;

import java.util.Map;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.comp.SubscriptionService;

@Component
public class SubscriptionFactoryBean implements FactoryBean<SubscriptionService> {

	@Autowired
	Map<String ,SubscriptionService> service;
	
	@Value("${s.type}")
   private String type;
	
	@Override
	public @Nullable SubscriptionService getObject() throws Exception {
		SubscriptionService service = this.service.get(type.toLowerCase());
		return service;
	}

	@Override
	public @Nullable Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

}
