package com.hackerrank.datastructures;



public class TreePostorderTraversal {

	/*
	 * you only have to complete the function given below. Node is defined as
	 * 
	 * 
	 */

	public static void postOrder(Node root) {

		if (root.left != null)
			postOrder(root.left);

		if (root.right != null)
			postOrder(root.right);
		System.out.print(root.data + " ");

	}

}