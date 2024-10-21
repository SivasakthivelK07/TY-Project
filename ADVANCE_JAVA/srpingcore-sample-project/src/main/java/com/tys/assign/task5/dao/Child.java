package com.tys.assign.task5.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Child {

	private String name;
	private int age;
	private String gender;
	private int standard;
	private List<String> hobbies;
	private Set<String> subjectsStudying;
	private Map<String, String> friendsAndGender;
	private List<Pet> pet;

}
