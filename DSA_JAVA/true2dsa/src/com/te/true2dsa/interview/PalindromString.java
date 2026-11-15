package com.te.true2dsa.interview;

public class PalindromString {

	public static void main(String[] args) {
		String s = "dadmomdad";
		boolean isPali = isPalindrom(s);
		System.out.println(isPali);
	}

	private static boolean isPalindrom(String s) {
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}

		if (s1.equals(s)) {
			return true;
		} else {
			return false;
		}

	}
}
