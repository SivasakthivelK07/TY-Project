package com.tys.assign.task4.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ FoodConfig.class, DrinkConfig.class })
public class AllConfig {
	

}
