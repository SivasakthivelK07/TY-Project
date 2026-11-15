package com.tys.assign.task4.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoodConfig {

	@Bean("food")
	public Food food() {
		return new Food("Biriyani", "Idli", "FriedRice", "Dosa");

	}
}
