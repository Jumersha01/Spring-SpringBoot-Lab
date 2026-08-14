package com.nt.exception;

public class BloodDonorNotFoundException extends RuntimeException {
  
	public BloodDonorNotFoundException(String message) {
		super(message);
	}
}
