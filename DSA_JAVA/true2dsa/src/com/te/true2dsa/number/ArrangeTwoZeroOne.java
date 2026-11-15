package com.te.true2dsa.number;

import java.util.Arrays;

public class ArrangeTwoZeroOne {

	public static void main(String[] args) {
		
		int[] arr = { 0,2,1,1,2,0,1,2 };
		System.out.println(Arrays.toString(arr));
		accumulateNumber(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void accumulateNumber(int[] arr) {
		int current = 0;
		int left = 0;
		int right = arr.length - 1;
		while (current <= right) {
			if (arr[current] == 2) {
				swap(arr, current, left);
				current++;
				left++;
			} else if (arr[current] == 0) {
				current++;
			} else {
				swap(arr, current, right);
				right--;
			}
		}

	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
