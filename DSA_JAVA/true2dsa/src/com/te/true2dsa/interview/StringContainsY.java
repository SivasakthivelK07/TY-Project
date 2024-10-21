package com.te.true2dsa.interview;

import java.util.Arrays;
import java.util.List;

public class StringContainsY {

	public static void main(String[] args) {
		String[] arr = { "siyte", "sdsfsy", "sivay", "vey", "dres" };
		
		System.out.println(Arrays.toString(arr));
		
		List<String> list = Arrays.stream(arr).filter(s->s.contains("y")).toList();
		
		System.out.println(list);
	}
}
