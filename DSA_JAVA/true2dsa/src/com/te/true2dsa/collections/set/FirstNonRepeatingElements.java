package com.te.true2dsa.collections.set;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElements {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 4, 1, 5, 1, 7, 8, 9, 2, 3, 4 };
		firstNonRepeatingElements(arr);
	}

	private static void firstNonRepeatingElements(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		System.out.println(map);

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("First non repeating elements: " + entry.getKey());
				break;
			}

		}
	}

}
