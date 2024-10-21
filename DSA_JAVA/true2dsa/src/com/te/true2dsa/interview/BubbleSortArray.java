package com.te.true2dsa.interview;


import java.util.Arrays;

public class BubbleSortArray {
	public static void main(String[] args) {
		Integer[] arr1 = { 5, 2, 89, 3, 12, 8, 10, 78 };
		Integer[] sort = sort(arr1);
		System.out.println("Select sort: "+Arrays.toString(sort));

		int[] arr = { 5, 2, 89, 3, 12, 8, 10, 78 };
		int[] bubbleSort = bubbleSort(arr);
		System.out.println("Bubble Sort: "+Arrays.toString(bubbleSort));
	}

	private static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
		return arr;
	}

	private static Integer[] sort(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
