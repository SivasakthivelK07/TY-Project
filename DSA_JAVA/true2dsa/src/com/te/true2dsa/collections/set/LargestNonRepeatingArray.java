package com.te.true2dsa.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LargestNonRepeatingArray {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 4, 1, 5, 1, 7, 8, 9, 2, 3 };
		Object[] largestNonRepeating = largestNonRepeating(arr);
		System.out.println(Arrays.toString(largestNonRepeating));
	}

	private static Object[] largestNonRepeating(int[] arr) {
		Set<Set<Integer>> arrays = new HashSet<Set<Integer>>();
		
		for (int i = 0; i < arr.length; i++) {
			Set<Integer> tracker = new HashSet<Integer>();
			
			for (int j = i; j < arr.length; j++) {
				if (!tracker.contains(arr[j])) {
					tracker.add(arr[j]);
				} else {
					Set<Integer> temp = new LinkedHashSet<Integer>();
					for (int k = i; k <= j; k++) {
						temp.add(arr[k]);
					}
					arrays.add(temp);
					break;
				}
			}
		}
		
		Set<Integer> maxSizeSet = new HashSet<Integer>();
		for (Set<Integer> a : arrays) {
			if (a.size() > maxSizeSet.size()) {
				maxSizeSet = a;
			}
		}
		return maxSizeSet.toArray();
	}
}
