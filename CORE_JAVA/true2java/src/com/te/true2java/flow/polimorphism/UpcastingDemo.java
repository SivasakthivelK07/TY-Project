package com.te.true2java.flow.polimorphism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UpcastingDemo {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.println(list);
		
		LinkedList<Integer> linkedList = (LinkedList<Integer>) list;
		linkedList.pop();

		// code....
		System.out.println(linkedList);
	}
}
