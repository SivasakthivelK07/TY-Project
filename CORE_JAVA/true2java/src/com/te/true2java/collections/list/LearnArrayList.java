package com.te.true2java.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class LearnArrayList {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(11);
		integers.add(10);
		integers.add(12);
		integers.add(50);
		integers.add(8);

		// 1.Using for loop
		for (int i = 0; i < integers.size(); i++) {
			System.out.print(integers.get(i) + " ");
		}
		System.out.println("For loop");

		// 2.Using for-each loop
		for (Integer integer : integers) {
			System.out.print(integer + " ");
		}
		System.out.println("For each loop");

		// 3. Using forEach() method
		Consumer<Integer> consumer;

		// a. Create a class and implements Cunsumer<> interface
		class MyConsumer implements Consumer<Integer> {

			@Override
			public void accept(Integer t) {
				System.out.print(t + " ");
			}
		}
		integers.forEach(new MyConsumer());
		System.out.println("For each method");

		// b. Create a Anonymous and implements Cunsumer<> interface
		consumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t + " ");
			}
		};
		integers.forEach(consumer);
		System.out.println();

		// c. Directly assign provide the implementation
		integers.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t + " ");
			}
		});
		System.out.println();

		// d.Using labmda expression
		consumer = t -> System.out.print(t + " ");
		integers.forEach(consumer);
		System.out.println();

		// d.Using method reference expression
		/*
		 * Only used for {@ method reference} in function interface using method
		 * reference we did not provide space inside the two elements
		 */

		integers.forEach(t -> System.out.print(t + " ")); // or
		System.out.println();
		integers.forEach(System.out::print);
		System.out.println();

		// 4. Stream API forEach() method
		integers.stream().forEach(t -> System.out.print(t + " ")); // or
		System.out.println("Stream API forEach()");
		integers.stream().forEach(consumer);
		System.out.println();

		// 5.Using Iterator<> interface
		// [1,2,3,4,5] cursor =-1 ->0
		Iterator<Integer> iterator = integers.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println("Iterator interface");

		// 6.Using ListIterator<> interface
		ListIterator<Integer> listIterator = integers.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
		System.out.println("List Iterator interface");
		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
		System.out.println();

	}

}
