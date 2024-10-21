package com.te.true2dsa.number;

import java.util.Arrays;

public class BinaryRespresentation {

	public static void main(String[] args) {
		Integer[] a = { 10, 2, 1, 4, 3 };
		System.out.println("Original Arrays");
		for (Integer i : a) {
			System.out.print(i + " ");
		}

		System.out.println("\nSorted Array ");
		Object[] sort = binaryRepresentation(a);
		for (Object i : sort) {
			System.out.print(i + " ");
		}
	}

	private static Object[] binaryRepresentation(Integer[] a) {
		return Arrays.stream(a).sorted((i1, i2) -> Integer.bitCount(i2) - Integer.bitCount(i1)).toArray();

	}

}
