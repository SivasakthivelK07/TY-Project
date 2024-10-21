package com.tyss.jspiders.apo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CustomerAspect {

	@Before("execution(* com.tyss.jspiders.apo.controller.CustomerController.getCustomer())")
	public void beforeCustomer() {
		System.out.println("Before Customer details");
	}

	@After("execution(* com.tyss.jspiders.apo.controller.CustomerController.getCustomer())")
	public void afterCustomer() {
		System.out.println("After Customer details");
	}	
	
}
