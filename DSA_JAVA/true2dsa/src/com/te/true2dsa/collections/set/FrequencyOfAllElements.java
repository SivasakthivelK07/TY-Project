package com.te.true2dsa.collections.set;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfAllElements {

	public static void main(String[] args) {
		int[] integer = { 10, 12, 10, 45, 51, 20, 45, 12 };
		Map<Integer, Integer> res = frequencyOfAllElements(integer);
		System.out.println(res);
	}

	private static Map<Integer, Integer> frequencyOfAllElements(int[] integer) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for (Integer i : integer) {
//			int count = 0;
//			for (int j = 0; j < integer.length; j++) {
//				if (i == integer[j]) {
//					count++;
//				}
//			}
//			map.put(i, count);
//		}

		for (int i : integer) {
			// getOrDefault method is used to count the how many times are elements are
			// present.
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		return map;

	}

}
