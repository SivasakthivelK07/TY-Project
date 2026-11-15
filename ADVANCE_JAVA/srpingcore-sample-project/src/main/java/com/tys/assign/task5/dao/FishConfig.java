package com.tys.assign.task5.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FishConfig {

	@Bean
	public Fish fish() {
		return new Fish();
	}
}
