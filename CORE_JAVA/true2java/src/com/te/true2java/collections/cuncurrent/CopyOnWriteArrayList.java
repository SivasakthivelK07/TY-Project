package com.te.true2java.collections.cuncurrent;

import java.util.Iterator;
import java.util.List;

public class CopyOnWriteArrayList {

	public static void main(String[] args) {
		List<String> arrayList = new java.util.concurrent.CopyOnWriteArrayList<String>();
		arrayList.add("F1");
		arrayList.add("F2");
		arrayList.add("F3");
		arrayList.add("F4");

		System.out.println(arrayList);

		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			arrayList.remove("F4");
		}

		System.out.println(arrayList);
	}

}
