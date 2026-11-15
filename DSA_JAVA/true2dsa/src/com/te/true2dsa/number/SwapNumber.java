package com.te.true2dsa.number;

import java.util.Arrays;

public class SwapNumber {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int i = 2;
		int j = 5;
		System.out.println(Arrays.toString(arr));
		int[] a = swapNumber(arr, i, j);
		System.out.println(Arrays.toString(a));
	}

	private static int[] swapNumber(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
}
