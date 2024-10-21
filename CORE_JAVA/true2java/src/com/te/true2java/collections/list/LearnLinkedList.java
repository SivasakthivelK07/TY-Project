package com.te.true2java.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class LearnLinkedList {

	public static void main(String[] args) {
		List<Integer> integers = new LinkedList<Integer>();
		integers.add(45);
		integers.add(64);
		integers.add(20);
		integers.add(50);
		integers.add(25);

		System.out.println("=====For loop=====");
		for (int i = 0; i < integers.size(); i++) {
			System.out.print(integers.get(i) + " ");
		}

		System.out.println("\n=======For-each=========");
		for (Integer integer : integers) {
			System.out.print(integer + " ");
		}

		// 3.Using forEach loop
		Consumer<Integer> consumer;
		System.out.println("\n======forEach() method1========");
		class MyConsumer implements Consumer<Integer> {

			@Override
			public void accept(Integer t) {
				System.out.print(t + " ");

			}
		}
		integers.forEach(new MyConsumer());

		System.out.println("\n=====forEach() method2=======");
		consumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t + " ");
			}
		};
		integers.forEach(consumer);

		System.out.println("\n======forEach()->Labmda expression======");
		consumer = t -> System.out.print(t + " ");
		integers.forEach(consumer);

		System.out.println("\n======forEach()->method reference======");
		integers.forEach(System.out::print);

		System.out.println("\n====Stream->forEach()=====");
		integers.stream().forEach(consumer);

		System.out.println("\n======Iterator interface======");
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
