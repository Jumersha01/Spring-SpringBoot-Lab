package com.nt.sbeans;

import org.springframework.stereotype.Component;

import com.nt.comp.EncryptionService;
@Component
public class AESEncryption implements EncryptionService {

	@Override
	public void encrypt() {
		System.out.println("AES Encryption successful: [Encrypted text]");
	}

	@Override
	public void decrypt() {
		System.out.println("AES Decryption successful: [Original text]");

	}

}
