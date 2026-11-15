package com.tys.assign.task4.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DrinkConfig {

	@Bean
	public Drink drink() {
		return new Drink("CocaCola", "MilkShake", "AppleJuice");
	}
}
