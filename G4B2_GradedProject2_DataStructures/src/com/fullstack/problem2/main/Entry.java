package com.fullstack.problem2.main;

import com.fullstack.problem2.model.BinarySearchTree;
import com.fullstack.problem2.model.Node;

/**
 * 
 * Converting BST to Right Skewed Tree
 *
 */

public class Entry {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();

		Node root = bst.creteInitialBST();
		Node skewedTreeRoot = bst.insertToSkewedTree(root);
		bst.displaySkewedTree(skewedTreeRoot);
	}
}
