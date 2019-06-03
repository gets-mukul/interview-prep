package com.amazon.prep;

public class MaxDiffInArray {

	public static void main(String[] args) {
		int[] arr = {7, 9, 5, 6, 3, 2};

		int flag = 1, i=0, diff = 0;

		while(i < arr.length && flag < arr.length) {
			if (arr[i] < arr[flag]) {
				diff = Math.max(diff, arr[flag] - arr[i]);
				flag++;
			} else {
				i = flag;
				flag = i + 1;
			}

		}

		System.out.println(diff);

	}

}
