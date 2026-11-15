package com.tyss.jspiders.sca.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class Employee {
	@Value("${name}")
	private String name;

	@Value("24")
	private Integer age;

	private List<String> list;

//	private Set<String> set;

//	private Map<String, String> map;

}
