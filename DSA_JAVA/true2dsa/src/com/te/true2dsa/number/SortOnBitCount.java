package com.te.true2dsa.number;

import java.util.Arrays;

public class SortOnBitCount {

	public static void main(String[] args) {
		Integer[] arr = { 12, 2, 43, 5, 44, 67, 6, 77, 8 };

		System.out.println("Original Array:");
		for (Integer integer : arr) {
			System.out.print(integer + " ");
		}

		System.out.println("\nSorted Array:");
		Object[] sort = sort(arr);
		for (Object integer : sort) {
			System.out.print(integer + " ");
		}
	}

	private static Object[] sort(Integer[] arr) {
		return Arrays.stream(arr).sorted((i1, i2) -> Integer.bitCount(i1) - Integer.bitCount(i2)).toArray();
	}
	
}

