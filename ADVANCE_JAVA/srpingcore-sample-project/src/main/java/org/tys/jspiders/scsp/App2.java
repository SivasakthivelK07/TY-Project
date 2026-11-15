package org.tys.jspiders.scsp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tys.jspiders.scsp.dao.Student;

import com.tys.assign.task2.dao.Creature;
import com.tys.assign.task2.dao.Earth;
import com.tys.assign.task2.dao.HumanBeing;

public class App2 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("configtask2.xml");
		Earth earth = context.getBean("earth", Earth.class);
		System.out.println(earth.getPalnentRadius());
		System.out.println(earth.getWaterOnPlanetPercentage());
		List<Creature> creature = earth.getCreature();
		for (Creature creature2 : creature) {
			System.out.println(creature2.creatureName());
			System.out.println(creature2.creatureType());
		}

	}

}
