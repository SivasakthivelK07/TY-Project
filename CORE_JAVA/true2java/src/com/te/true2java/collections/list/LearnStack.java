package com.te.true2java.collections.list;

import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {
		Stack<Integer> integers = new Stack<Integer>();
		integers.push(10);
		integers.push(8);
		integers.push(60);
		integers.push(80);
		integers.push(5);
		
		System.out.println("======For loop======");
//		System.out.println(integers.size());
		for (int i = 0; i < integers.size(); i++) {
//			System.out.println(i);
			System.out.print(integers.pop()+" ");
		}
		
		System.out.println();
		for (Integer integer : integers) {
			System.out.print(integer+" ");
		}
	}

}
