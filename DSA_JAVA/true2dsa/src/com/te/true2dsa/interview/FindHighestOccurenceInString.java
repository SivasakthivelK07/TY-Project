package com.te.true2dsa.interview;

import java.util.HashMap;
import java.util.Map;

public class FindHighestOccurenceInString {

	public static void main(String[] args) {
		String s = "aabbccddaaddddaa";

		Integer[] i = { 1, 2, 3, 1, 2, 3, 4, 1, 2, 5, 6, 7 };

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		System.out.println(map);

		System.out.println("========================");

		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		for (Integer integer : i) {
			map2.put(integer, map2.getOrDefault(integer, 0) + 1);
		}
		
		System.out.println(map2);

	}
}
