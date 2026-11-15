package com.te.true2java.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameAverage {

	static List<Double> average = new ArrayList<Double>();
	static List<String> name = new ArrayList<String>();

	public static void main(String[] args) {
		String[][] arr = { { "12", "48", "72", "Rajesh" }, { "Raj", "100", "79" }, { "51", "Arjun", "88" },
				{ "Tanu", "77", "75" }, { "Prakash", "41" } };

		for (String[] strings : arr) {
			System.out.println(Arrays.toString(strings));
		}
		System.out.println("============================");

		findAverage(arr);

		double d = 0.0;
		String s = "";
		for (int i = 0; i < average.size(); i++) {
			if (d < average.get(i)) {
				d = average.get(i);
				s = name.get(i);
			}
		}
		System.out.println(s + " = " + d);

	}

	private static void findAverage(String[][] arr) {
		for (String[] strings : arr) {
			int sum = 0;
			int count = 0;
			for (String strings2 : strings) {
				try {
					int num = Integer.valueOf(strings2);
					count++;
					sum += num;
				} catch (NumberFormatException e) {
					name.add(strings2);
				}
			}
			average.add((double) (sum / count));
		}
	}

}
