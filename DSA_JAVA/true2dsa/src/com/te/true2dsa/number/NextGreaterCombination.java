package com.te.true2dsa.number;

import java.util.Set;
import java.util.TreeSet;

//123, 231, 321, 213, 312, 132
public class NextGreaterCombination {
	
	static Set<Integer> combinations = new TreeSet<Integer>();
	
	public static void main(String[] args) {
		int num = 1234;
		combination("", String.valueOf(num));
		for (Integer i : combinations) {
			if (i > num) {
				System.out.println(i);
				break;
			}
		}
	}

	private static void combination(String prefix, String remaining) {
		if (prefix != "") {
			combinations.add(Integer.valueOf(prefix));
		}
		int length = remaining.length();
		for (int i = 0; i < length; i++) {
			combination(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1));
		}
	}
}

