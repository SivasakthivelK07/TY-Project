package com.te.true2java.collections.cuncurrent;

import java.util.ArrayList;
import java.util.Iterator;

public class CuncurrentModificationException {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("F1");
		arrayList.add("F2");
		arrayList.add("F3");
		arrayList.add("F4");
		
		System.out.println(arrayList);
		
		Iterator<String> iterator=arrayList.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			arrayList.add("F5");
		}

		System.out.println(arrayList);
	}

}
