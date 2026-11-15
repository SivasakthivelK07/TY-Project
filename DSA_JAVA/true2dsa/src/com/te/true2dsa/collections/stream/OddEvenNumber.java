package com.te.true2dsa.collections.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OddEvenNumber {

	public static void main(String[] args) {
		int[] a = { 10, 12, 11, 13, 14, 15, 16, 17 };

		int[] odd = Arrays.stream(a).filter(arr -> arr % 2 == 0).toArray();

		System.out.println("Odd Number:" + Arrays.toString(odd));

		int[] even = Arrays.stream(a).filter(arr -> arr % 2 != 0).toArray();
		System.out.println("Even Number:" + Arrays.toString(even));

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 5 intergers");
		List<Integer> integers = new ArrayList<Integer>();
		while (integers.size() < 5) {
			integers.add(sc.nextInt());
		}

//		List<Integer> collect = integers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//		List<Integer> collect1 = integers.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
//		System.out.println("Even Number" + collect);
//		System.out.println("Odd Number" + collect1);

		Map<Boolean, List<Integer>> collect = integers.stream().collect(Collectors.partitioningBy(i->i%2==0));
		List<Integer> list = collect.get(true);
		List<Integer> list2 = collect.get(false);
		
		System.out.println("Even : "+list);
		System.out.println("Odd : "+list2);
	}

}
