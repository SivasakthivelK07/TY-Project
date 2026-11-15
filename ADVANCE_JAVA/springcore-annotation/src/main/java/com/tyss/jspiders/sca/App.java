package com.tyss.jspiders.sca;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tyss.jspiders.sca.dao.Employee;

@Configuration
@ComponentScan
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				App.class);
		Employee employee = annotationConfigApplicationContext.getBean("employee", Employee.class);

		System.out.println(employee);

	}
}
