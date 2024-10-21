package com.tys.assign.task5.dao;

public class Dog implements Pet {

	@Override
	public String petType() {
		return "petType method Dog";
	}

	@Override
	public String petName() {
		return "petName method Dog";
	}

}

