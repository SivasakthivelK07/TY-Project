package com.te.true2dsa.interview;

import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str = "interviewer";
		String collect = str.chars().distinct().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());

		System.out.println(collect);

		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != '@') {
				for (int j = i + 1; j < charArray.length; j++) {
					if (charArray[i] == charArray[j]) {
						charArray[j] = '@';
					}
				}
			}
		}

		String s = "";
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i]!='@') {
				s=s+charArray[i];
			}
		}

		System.out.println(s);
	}

}
