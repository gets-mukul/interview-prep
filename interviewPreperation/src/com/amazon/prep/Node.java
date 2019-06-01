package com.amazon.prep;

class Node {
	int val;
	Node left, right;

	Node(int x) {
		val = x;
		left = right = null;
			
		}
	
	public static void display(Node root) {
		if(root == null) {
			return;
		}
		System.out.println(root.val);
		display(root.left);
		display(root.right);
	}
}
