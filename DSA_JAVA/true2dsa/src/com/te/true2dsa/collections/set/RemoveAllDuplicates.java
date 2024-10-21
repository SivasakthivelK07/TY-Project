package com.te.true2dsa.collections.set;

import java.util.HashSet;
import java.util.Set;

public class RemoveAllDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 1, 2, 4 };
		Set<Integer> removeDuplicate = removeDuplicate(arr);
		System.out.println(removeDuplicate);

	}

	private static Set<Integer> removeDuplicate(int[] arr) {
		Set<Integer> temp = new HashSet<Integer>();
		Set<Integer> duplicate = new HashSet<Integer>();
		for (Integer integer : arr) {
			if (!temp.add(integer)) {
				duplicate.add(integer);
			}
		}

		Set<Integer> set = new HashSet<Integer>();
		for (Integer integer : arr) {
			if (!duplicate.contains(integer)) {
				set.add(integer);
			}
		}

		return set;

	}

}
