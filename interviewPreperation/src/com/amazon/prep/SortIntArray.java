package com.amazon.prep;

import java.util.Arrays;

public class SortIntArray {

	public static void main(String[] args) {
		int arr[] = {-6, -3, -1, 2, 4, 5};
		
		for(int i=0; i<arr.length; i++) {
			arr[i] *= arr[i];
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
