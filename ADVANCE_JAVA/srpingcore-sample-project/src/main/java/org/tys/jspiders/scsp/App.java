package org.tys.jspiders.scsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tys.jspiders.scsp.dao.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		System.out.println(student.getCource());
		System.out.println(student.getCource().getCourceName());
	}

}
