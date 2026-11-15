package com.te.true2dsa.number;

import java.util.Arrays;

public class RotateByKTowardsLeft {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 3;
		System.out.println(Arrays.toString(arr));
		leftRotateByK(arr, k);
		System.out.println(Arrays.toString(arr));
	}

	private static void leftRotateByK(int[] arr, int k) {
		int j = 0;
		while (j < k) {
			int temp = arr[0];
			for (int i = 1; i < arr.length; i++) {
				int current = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = current;
			}
			arr[arr.length - 1] = temp;
			j++;
		}
	}

}
