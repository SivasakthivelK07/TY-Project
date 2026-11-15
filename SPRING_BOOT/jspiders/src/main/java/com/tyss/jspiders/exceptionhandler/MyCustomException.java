package com.tyss.jspiders.exceptionhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyCustomException extends RuntimeException{
	
	public MyCustomException(String message) {
		super(message);
	}
	
	@ExceptionHandler(Exception.class)
	public Exception exception(Exception exception) {
		return new Exception("Compile Time");
	}
	
	public RuntimeException runException(RuntimeException exception) {
		return new RuntimeException("Run Time");
	}
}
