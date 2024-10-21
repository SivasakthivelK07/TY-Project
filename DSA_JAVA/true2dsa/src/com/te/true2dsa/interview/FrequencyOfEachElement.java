package com.te.true2dsa.interview;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElement {

	public static void main(String[] args) {
		String string = "MALAYALAM";

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character c : string.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		System.out.println(map);
	}
	
}
