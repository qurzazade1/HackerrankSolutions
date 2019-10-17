package com.hackerrank.datastructures;

class Node {
	int data;
	Node left;
	Node right;
}

public class TreePreorderTraversal {

	/*
	 * you only have to complete the function given below. Node is defined as
	 * 
	 * 
	 */

	public static void preOrder(Node root) {

        System.out.print(root.data + " ");
        if (root.left != null)
            preOrder(root.left);

        
        if (root.right != null)
            preOrder(root.right);

    }
}