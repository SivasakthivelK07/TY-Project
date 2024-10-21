package com.te.true2java.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfRepeatingCount {
	static List<String> list = new ArrayList<String>();

	public static void main(String[] args) {
		Character[] arr = { 'a', 'a', 'a', 'b', 'c', 'c', 'b', 'b', 'a' };
		System.out.println(Arrays.toString(arr));
		countRepeatingNumber(arr);
		System.out.println(list);
	}

	private static void countRepeatingNumber(Character[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != '@') {
				int count = 1;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
						arr[j] = '@';
					}
				}
				list.add(arr[i]+""+count);
			}
		}
	
	}

}
