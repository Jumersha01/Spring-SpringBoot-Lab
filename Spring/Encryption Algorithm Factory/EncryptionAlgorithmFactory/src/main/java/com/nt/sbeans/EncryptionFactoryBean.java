package com.nt.sbeans;

import java.util.Map;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.comp.EncryptionService;

@Component("enc")
public class EncryptionFactoryBean implements FactoryBean<EncryptionService>{

	@Autowired
	Map<String,EncryptionService> service;
	
	@Value("AESEncryption")
	private  String type;
	
//	 public EncryptionFactoryBean (Map<String,EncryptionService> service) {
//		 this.service=service;
//	 }
	
	
	@Override
	public  EncryptionService getObject() throws Exception {
		
		return service.get(type);
	}

	@Override
	public  Class<?> getObjectType() {
		
		return EncryptionService.class;
	}






}
