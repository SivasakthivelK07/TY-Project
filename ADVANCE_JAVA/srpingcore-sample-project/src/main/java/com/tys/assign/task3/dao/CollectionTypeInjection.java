package com.tys.assign.task3.dao;

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
public class CollectionTypeInjection {

	private List<Integer> list;
	private Set<Double> set;
	private Map<Integer, String> map;

}
