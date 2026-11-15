package com.tys.assign.task2.dao;

import lombok.ToString;

@ToString
public class Lion implements Creature {

	@Override
	public String creatureName() {
		return "creatureName method in Lion";
	}

	@Override
	public String creatureType() {
		return "creatureType method in Lion";
	}

}
