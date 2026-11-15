package com.te.true2java.mock;

import java.util.Arrays;

public class BinaryRepresentation {

	public static void main(String[] args) {
		Integer[] arr = { 10, 2, 4, 6, 8, 15 };
		System.out.println("Before Sorted Array");
		for (Integer integer : arr) {
			System.out.print(integer + " ");
		}
		System.out.println("After sorted Array");
		Object[] objects = sort(arr);
		for (Object object : objects) {
			System.out.print(object);
		}

	}

	private static Object[]  sort(Integer[] arr) {
		return Arrays.stream(arr).sorted((i,j)-> Integer.bitCount(i)-Integer.bitCount(j)).toArray();
	}

}
