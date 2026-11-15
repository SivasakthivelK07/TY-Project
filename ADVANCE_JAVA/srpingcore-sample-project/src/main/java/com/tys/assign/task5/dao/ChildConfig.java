package com.tys.assign.task5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChildConfig {

	@Autowired
	public Child child() {
		return null;
//		return new Child("siva", 24, "male", "IT", "Kabadi", "Java", "abc", "pet");
	}
}
