package com.te.true2java.collections.list;

import java.util.ArrayList;

public class AA {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(10);
		
		
//		for (Integer integer : arrayList) {
//			arrayList.remove(integer);
//		}
		arrayList.forEach(System.out::println);
	}
}
