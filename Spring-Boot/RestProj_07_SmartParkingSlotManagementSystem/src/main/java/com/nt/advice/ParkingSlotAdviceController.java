package com.nt.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nt.exception.ParkingSlotNotFoundException;

@RestControllerAdvice
public class ParkingSlotAdviceController {
     
	@ExceptionHandler(ParkingSlotNotFoundException.class)
	public String getException(ParkingSlotNotFoundException ex) {
		return ex.getMessage();
	}
	
}
