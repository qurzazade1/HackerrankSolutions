package com.hackerrank.datastructures;


	import java.util.*;
	import java.io.*;

	class Node1 {
	    Node1 left;
	    Node1 right;
	    int data;
	    
	    Node1(int data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

	public class BinarySearchTree_LowestCommonAnestore {

		/*
	    class Node1 
	    	int data;
	    	Node1 left;
	    	Node1 right;
		*/
		public static Node1 lca(Node1 Node1, int n1, int n2) {
	      	// Write your code here.

	  if (Node1 == null) 
	            return null; 
	   
	        // If both n1 and n2 are smaller than root, then LCA lies in left 
	        if (Node1.data > n1 && Node1.data > n2) 
	            return lca(Node1.left, n1, n2); 
	   
	        // If both n1 and n2 are greater than root, then LCA lies in right 
	        if (Node1.data < n1 && Node1.data < n2)  
	            return lca(Node1.right, n1, n2); 
	   
	        return Node1;

	    }

		public static Node1 insert(Node1 root, int data) {
	        if(root == null) {
	            return new Node1(data);
	        } else {
	            Node1 cur;
	            if(data <= root.data) {
	                cur = insert(root.left, data);
	                root.left = cur;
	            } else {
	                cur = insert(root.right, data);
	                root.right = cur;
	            }
	            return root;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int t = scan.nextInt();
	        Node1 root = null;
	        while(t-- > 0) {
	            int data = scan.nextInt();
	            root = insert(root, data);
	        }
	        int v1 = scan.nextInt();
	      	int v2 = scan.nextInt();
	        scan.close();
	        Node1 ans = lca(root,v1,v2);
	        System.out.println(ans.data);
	    }	
	}