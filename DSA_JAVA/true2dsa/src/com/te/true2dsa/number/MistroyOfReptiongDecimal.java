package com.te.true2dsa.number;

public class MistroyOfReptiongDecimal {
	public static void main(String[] args) {
		float n = 1;
		float d = 3;
		getRespesented(n, d);
	}

	private static void getRespesented(float n, float d) {
		if (n == 0 || d == 0) {
			System.out.println("No Representation possilbe");
			return;
		}
		String s = (n / d) + "";
		System.out.println(s);
		String[] split = s.split("\\.");
		System.out.print(split[0] + ".");
		char[] array = split[1].toCharArray();
		char temp = array[0];
		int count = 0;
		for (int i = 1; i < array.length; i++) {
			if (temp == array[i]) {
				count++;
				if (count >= 3) {
					System.out.println("(" + temp + ")");
					break;
				}
			} else {
//				System.out.println(temp);
				temp = array[i];
			}
		}
	}

}
