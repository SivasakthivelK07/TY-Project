package com.tyss.jspiders.apo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.jspiders.apo.service.CustomerService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping(path = "/api")
@RestController
public class CustomerController {
	
	private final CustomerService customerService;
	
	@GetMapping(path = "")
	public String getCustomer() {
		System.out.println(customerService.getCustomer());
		return customerService.getCustomer();
	}

}
