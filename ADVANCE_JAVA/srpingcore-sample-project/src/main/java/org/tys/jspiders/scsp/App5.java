package org.tys.jspiders.scsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tys.assign.task4.dao.Drink;
import com.tys.assign.task4.dao.Food;
import com.tys.assign.task5.dao.AllConfig;
import com.tys.assign.task5.dao.Fish;
import com.tys.assign.task5.dao.FishConfig;

public class App5 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new AnnotationConfigApplicationContext(AllConfig.class);
		Fish fish = context.getBean("fish", Fish.class);
		System.out.println(fish.petName());
		System.out.println(fish.petType());
	}

}
