package org.tys.jspiders.scsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tys.assign.task4.dao.AllConfig;
import com.tys.assign.task4.dao.Drink;
import com.tys.assign.task4.dao.Food;

public class App4 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new AnnotationConfigApplicationContext(AllConfig.class);
		Food food = context.getBean("food", Food.class);
		System.out.println(food.getBiriyani());
		System.out.println(food.getDosa());
		System.out.println(food.getFriedRice());
		System.out.println(food.getIdli());
		
		Drink drink = context.getBean("drink", Drink.class);
		System.out.println(drink.getAppleJuice());
		System.out.println(drink.getCocacola());
		System.out.println(drink.getMilkshake());


	}

}
