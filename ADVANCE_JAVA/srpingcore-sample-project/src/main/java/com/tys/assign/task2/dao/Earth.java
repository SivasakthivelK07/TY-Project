package com.tys.assign.task2.dao;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Earth {

	private double palnentRadius;
	private double waterOnPlanetPercentage;
	private List<Creature> creature;

}
