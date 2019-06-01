package com.amazon.prep;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		int[] arr = { 11, 13, 21, 3};

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > stack.peek()) {
				while (!stack.isEmpty() && arr[i] > stack.peek()) {
					System.out.println(stack.pop() + " " + arr[i]);

				}

				stack.push(arr[i]);
			} else {
				stack.push(arr[i]);
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop()+  " -1");
		}

	}

}
