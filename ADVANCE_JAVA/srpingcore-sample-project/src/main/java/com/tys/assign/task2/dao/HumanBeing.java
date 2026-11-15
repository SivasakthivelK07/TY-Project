package com.tys.assign.task2.dao;

import lombok.ToString;

@ToString
public class HumanBeing implements Creature {

	@Override
	public String creatureName() {
		return "creatureName method in HumanBeing";
	}

	@Override
	public String creatureType() {
		return "creatureType method in HumanBeing";
	}

}
