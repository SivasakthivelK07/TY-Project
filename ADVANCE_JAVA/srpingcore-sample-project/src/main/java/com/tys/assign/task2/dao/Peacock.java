package com.tys.assign.task2.dao;

import lombok.ToString;

@ToString
public class Peacock implements Creature {

	@Override
	public String creatureName() {
		return "creatureName method in Peacock";
	}

	@Override
	public String creatureType() {
		return "creatureType method in Peacock";
	}

}
