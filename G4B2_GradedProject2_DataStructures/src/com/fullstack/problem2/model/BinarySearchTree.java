package com.fullstack.problem2.model;

import java.util.Deque;
import java.util.LinkedList;

public class BinarySearchTree {

	public Node creteInitialBST() {

		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.right.left = new Node(55);
		return root;
	}

	private Deque<Integer> inorder(Node root, Deque<Integer> queue) {

		if (root == null)
			return queue;
		else {
			inorder(root.left, queue);
			queue.add(root.data);
			inorder(root.right, queue);

		}
		return queue;
	}

	public Node insertToSkewedTree(Node root) {

		Deque<Integer> queue = new LinkedList<Integer>();

		queue = inorder(root, queue);

		Node skewedTreeRoot = new Node(queue.poll());
		Node currentNode = skewedTreeRoot;

		// Iterating through Queue to insert nodes into the Right Skewed Tree
		for (Integer value : queue) {
			currentNode.right = new Node(value);
			currentNode = currentNode.right;
		}

		return skewedTreeRoot;

	}

	public void displaySkewedTree(Node skewedTreeRoot) {

		System.out.println("Right Skewed Tree is: ");
		System.out.print(skewedTreeRoot.data + " ");
		while (skewedTreeRoot.right != null) {
			System.out.print(skewedTreeRoot.right.data + " ");
			skewedTreeRoot = skewedTreeRoot.right;
		}

	}
}
