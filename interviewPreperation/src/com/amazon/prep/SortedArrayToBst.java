/*
 * Sorted Array to Balanced BST
Given a sorted array. Write a function that creates a Balanced Binary Search Tree using array elements.
Examples:

Input:  Array {1, 2, 3}
Output: A Balanced BST
     2
   /  \
  1    3 

Input: Array {1, 2, 3, 4}
Output: A Balanced BST
      3
    /  \
   2    4
 /
1
*/

package com.amazon.prep;

public class SortedArrayToBst {

	public static Node createBst(int[] arr, int start, int end) {
		if (start > end) {
			return null;
		}

		int mid = (start + end) / 2;
		Node node = new Node(arr[mid]);

		node.left = createBst(arr, start, mid - 1);
		node.right = createBst(arr, mid + 1, end);

		return node;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2;
		
		Node.display(createBst(arr, start, end));

	}

}
