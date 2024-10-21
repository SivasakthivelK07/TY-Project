package com.te.true2java.collections.cuncurrent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Synchonized {

	public static void main(String[] args) {
		List<String> arrayList = Collections.synchronizedList(new ArrayList());
		arrayList.add("F1");
		arrayList.add("F2");
		arrayList.add("F3");
		arrayList.add("F4");

		System.out.println(arrayList);

		Thread thread = new Thread(() -> {
			synchronized (arrayList) {
				Iterator<String> iterator = arrayList.iterator();
				while (iterator.hasNext()) {
					String string = (String) iterator.next();
					arrayList.remove("F4");
				}
			}
		});

		System.out.println(arrayList);
	}

}
