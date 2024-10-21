package com.te.true2dsa.number;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
//		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		int[] array = Arrays.stream(arr).sorted().toArray();
		System.out.println(Arrays.toString(array));
	}

}
