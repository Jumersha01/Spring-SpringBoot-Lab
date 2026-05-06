package com.nt.sbeans;

import org.springframework.stereotype.Component;

import com.nt.comp.EncryptionService;
@Component
public class SHAHashing implements EncryptionService {

	@Override
	public void encrypt() {
		System.out.println("SHAH Encryption successful: [Encrypted text]");
	}

	@Override
	public void decrypt() {
		System.out.println("SHAH decryption successful: [Original text]");
	}

}
