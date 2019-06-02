package com.amazon.prep;

import java.util.Stack;

public class SpiralTreeTraversal {
	public static void displaySpiralTree(Node root) {
		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();

		stack1.add(root);

		while (!stack1.isEmpty() || !stack2.isEmpty()) {

			while (!stack1.isEmpty()) {
				Node temp = stack1.pop();
				System.out.println(temp.val);
				if (temp.left != null) {
					stack2.push(temp.left);

				}
				if (temp.right != null) {
					stack2.push(temp.right);
				}
			}

			while (!stack2.isEmpty()) {
				Node temp = stack2.pop();
				System.out.println(temp.val);
				if (temp.right != null) {
					stack1.push(temp.right);
				}
				if (temp.left != null) {
					stack1.push(temp.left);
				}
			}
		}

	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		displaySpiralTree(root);

	}

}
