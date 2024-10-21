package com.te.true2dsa.interview;

import java.util.Arrays;
import java.util.List;

public class SumListOfInteger {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(10, 20, 30, 40, 50, 60);

		int sum = integers.stream().mapToInt(Integer::intValue).sum();
		Integer sum1 = integers.stream().reduce(0, (i, j) -> i + j);

		int[] number = { 10, 20, 30, 40, 50, 60 };
		int reduce = Arrays.stream(number).reduce(0, (i, j) -> i + j);

		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(reduce);

	}
}
