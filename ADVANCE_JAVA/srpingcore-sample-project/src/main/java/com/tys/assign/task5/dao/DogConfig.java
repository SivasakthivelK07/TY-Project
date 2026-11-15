package com.tys.assign.task5.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DogConfig {

	@Bean
	public Dog dog() {
		return new Dog();
	}

}
