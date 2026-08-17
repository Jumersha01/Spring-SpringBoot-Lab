package com.nt.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Prime-Number-Producer")
public interface PrimeNumberClient {
	
	@GetMapping("/check/{number}")
	public String getMethodName(@PathVariable Integer number);

}
