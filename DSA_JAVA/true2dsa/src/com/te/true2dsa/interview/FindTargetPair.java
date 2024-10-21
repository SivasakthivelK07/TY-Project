package com.te.true2dsa.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTargetPair {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int target = 9;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					map.put(arr[i], arr[j]);
//					arr[j] =0;
					break;
				}
			}
		}

		System.out.println(map);
		System.out.println(Arrays.toString(arr));
	}

}
