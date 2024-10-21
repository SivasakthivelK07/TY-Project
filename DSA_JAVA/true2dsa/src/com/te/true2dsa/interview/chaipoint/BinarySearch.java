package com.te.true2dsa.interview.chaipoint;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		int target = 10;

		int index = binarySearch(list, target);
		System.out.println(index);

	}

	private static int binarySearch(List<Integer> list, int target) {
		int low = 0;
		int high = list.size() - 1;

		while (low < high) {
			int mid = low + (high - low) / 2;
			if (list.get(mid) == target) {
				return mid;
			} else if (list.get(mid) < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;
	}
}
