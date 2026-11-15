package com.te.true2dsa.number;

import java.util.Arrays;

public class RotateByOneTowardsLeft {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));
		leftRotateByOne(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void leftRotateByOne(int[] arr) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			arr[i] = arr[i - 1];
			arr[i - 1] = current;
		}
		arr[arr.length - 1] = temp;

	}

}
