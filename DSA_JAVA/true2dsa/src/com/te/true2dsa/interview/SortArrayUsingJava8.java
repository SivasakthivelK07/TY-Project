package com.te.true2dsa.interview;

import java.util.Arrays;
import java.util.List;

public class SortArrayUsingJava8 {

	public static void main(String[] args) {
		Integer[] arr = { 10, 15, 12, 20, 61, 11, 17 };

		Arrays.sort(arr, (a, b) -> b - a);
		System.out.println("Lambda Exprission: " + Arrays.toString(arr));

		List<Integer> list = Arrays.stream(arr).sorted((a, b) -> a - b).toList();
		System.out.println(" Stream API: " + list);

	}

}
