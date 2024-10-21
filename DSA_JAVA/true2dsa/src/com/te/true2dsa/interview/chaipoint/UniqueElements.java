package com.te.true2dsa.interview.chaipoint;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UniqueElements {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 10, 20, 30, 60);

		uniqueElement1(list);
//		uniqueElement2(list);
//		uniqueElement3(list);

	}

	private static void uniqueElement3(List<Integer> list) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer integer : list) {
			map.put(integer, map.getOrDefault(integer, 0) + 1);
		}
		System.out.println(map);
		for (Map.Entry<Integer, Integer> iterator : map.entrySet()) {
			if(iterator.getValue()==1) {
				System.out.print(iterator.getKey()+" ");
			}
		}
	}

	private static void uniqueElement2(List<Integer> list) {
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();

		for (Integer integer : list) {
			if (!set.add(integer)) {
				set1.add(integer);
			}
		}
		for (Integer integer : set) {
			if (!set1.contains(integer)) {
				set2.add(integer);
			}
		}
		System.out.println(set2);
	}

	private static void uniqueElement1(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			int count = 1;
			for (int j = 0; j < list.size(); j++) {
				if (i != j && list.get(i).equals(list.get(j))) {
					list.set(j, -1);
					count++;
				}
			}
			if (count == 1) {
				System.out.print(list.get(i) + " ");
			}
		}
	}

}
