package org.tys.jspiders.scsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tys.jspiders.scsp.dao.Student;

import com.tys.assign.task3.dao.CollectionTypeInjection;

public class App3 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("configtask3.xml");
		CollectionTypeInjection collectionTypeInjection = context.getBean("collectionliTypeSetter", CollectionTypeInjection.class);
		
		System.out.println(collectionTypeInjection.getList());
		System.out.println(collectionTypeInjection.getMap());
		System.out.println(collectionTypeInjection.getSet());
	}

}
