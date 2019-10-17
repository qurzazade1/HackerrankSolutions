package com.hackerrank.datastructures;

public class Tree_HeightOfABinaryTree {


    /*
    class Node 
        int data;
        Node left;
        Node right;
    */
    public static int height(Node root) {
        // Write your code here.
        int left = 0, right = 0;
        if (root.left != null)
            left = 1 + height(root.left);

        //System.out.print(root.data + " ");
        if (root.right != null)
            right = 1 + height(root.right);

        return Math.max(left, right);

    }


}
