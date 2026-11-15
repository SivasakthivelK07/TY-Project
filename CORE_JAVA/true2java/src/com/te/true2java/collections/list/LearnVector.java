package com.te.true2java.collections.list;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.function.Consumer;

public class LearnVector {

	public static void main(String[] args) {
		List<Integer> integers = new Vector<Integer>();
		integers.add(10);
		integers.add(40);
		integers.add(5);
		integers.add(110);
		integers.add(50);

		System.out.println("=====For Loop======");
		for (int i = 0; i < integers.size(); i++) {
			System.out.print(integers.get(i) + " ");
		}

		System.out.println("\n=====For-each loop======");
		for (Integer integer : integers) {
			System.out.print(integer + " ");
		}

		System.out.println("\n=====forEach() method======");
		Consumer<Integer> consumer;
		class MyConsumer implements Consumer<Integer> {

			@Override
			public void accept(Integer t) {
				System.out.print(t + " ");

			}
		}
		integers.forEach(new MyConsumer());
		System.out.println();

		consumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t + " ");

			}
		};
		integers.forEach(consumer);
		System.out.println();

		consumer = t -> System.out.print(t + " ");
		integers.forEach(consumer);
		System.out.println();

		integers.forEach(System.out::print);

		System.out.println("\n====Iterator interface====");
		Iterator<Integer> iterator = integers.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println("\n======ListIterator interface======");
		ListIterator<Integer> ListIterator = integers.listIterator();
		while (ListIterator.hasNext()) {
			System.out.print(ListIterator.next() + " ");
		}
		System.out.println();
		while (ListIterator.hasPrevious()) {
			System.out.print(ListIterator.previous() + " ");
		}
	}

}
