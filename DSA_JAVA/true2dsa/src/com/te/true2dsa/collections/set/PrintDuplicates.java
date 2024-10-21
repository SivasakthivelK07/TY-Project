package com.te.true2dsa.collections.set;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 1, 2, 4 };
		Set<Integer> printDuplicates = printDuplicates(arr);
		System.out.println(printDuplicates);
		
	}

	private static Set<Integer> printDuplicates(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for (Integer integer : arr) {
			if (!set.add(integer)) {
				set2.add(integer);
			}
		}
		return set2;
	}

}
