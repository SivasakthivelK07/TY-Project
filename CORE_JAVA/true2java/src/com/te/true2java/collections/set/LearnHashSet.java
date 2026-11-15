package com.te.true2java.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class LearnHashSet {

	public static void main(String[] args) {
		Set<Integer> integers = new HashSet<Integer>();
		integers.add(10);
		integers.add(11);
		integers.add(50);
		integers.add(61);
		integers.add(10);
		integers.add(11);

		// 1.Duplicate are not allowed
		// 2.Intersion order is not maintain
		// 3.We did not use for loop in HashSet Interface
		System.out.println("======For-each Loop======");
		for (Integer integer : integers) {
			System.out.print(integer + " ");
		}

		System.out.println("\n=====Anonymous class=====");
		Consumer<Integer> consumer;
		consumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t + " ");
			}
		};
		integers.forEach(consumer);
		System.out.println();

		System.out.println("\n=====Labmda expression=====");
		consumer = t -> System.out.print(t + " ");
		integers.forEach(consumer);
		System.out.println();

		System.out.println("\n=====Stream -> forEach()=====");
		integers.stream().forEach(consumer);
		System.out.println();

	}

}
