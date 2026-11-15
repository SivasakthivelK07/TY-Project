package com.tys.assign.task2.dao;

import lombok.ToString;

@ToString
public class GoldFish implements Creature {

	@Override
	public String creatureName() {
		return "creatureName method in GoldFish";
	}

	@Override
	public String creatureType() {
		return "creatureType method in GoldFish";
	}

}