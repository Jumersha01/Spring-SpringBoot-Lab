package com.nt.sbeans;

import org.springframework.stereotype.Component;

import com.nt.comp.EncryptionService;

@Component
public class RSAEncryption implements EncryptionService {

	@Override
	public void encrypt() {
		System.out.println("RSA Encryption successful: [Encrypted text]");
	}

	@Override
	public void decrypt() {
		System.out.println("RSA decryption successful: [Original text]");

	}

}
