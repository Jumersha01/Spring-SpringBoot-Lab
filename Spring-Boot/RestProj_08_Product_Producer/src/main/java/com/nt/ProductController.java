package com.nt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    
	@GetMapping("/courier/status")
	public String getMessage() {
		return "Corier package is ready for delivery";
	}
}
