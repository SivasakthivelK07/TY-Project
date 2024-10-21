package com.te.true2dsa.stream;

import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		String s = "aaabbcddeee";
		Map<Character, Long> collect = s.chars().mapToObj(c -> Character.valueOf((char) c))
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		String collect2 = collect.entrySet().stream().map(c -> c.getKey() + "" + c.getValue() + " ")
				.collect(Collectors.joining());

		System.out.println(collect);
		System.out.println(collect2);
	}

}
