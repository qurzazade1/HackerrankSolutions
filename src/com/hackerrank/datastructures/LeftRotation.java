package com.hackerrank.datastructures;

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class LeftRotation {




	    private static final Scanner scanner = new Scanner(System.in);



	    void leftRotate(int arr[], int d, int n) 
	    { 
	        for (int i = 0; i < d; i++) 
	            leftRotatebyOne(arr, n); 
	    } 
	  
	    void leftRotatebyOne(int arr[], int n) 
	    { 
	        int i, temp; 
	        temp = arr[0]; 
	        for (i = 0; i < n - 1; i++) 
	            arr[i] = arr[i + 1]; 
	        arr[i] = temp; 
	    } 

	  void printArray(int arr[], int n) 
	    { 
	        for (int i = 0; i < n; i++) 
	            System.out.print(arr[i] + " "); 
	    } 

	    public static void main(String[] args) {
	        String[] nd = scanner.nextLine().split(" ");

	        int n = Integer.parseInt(nd[0]);

	        int d = Integer.parseInt(nd[1]);

	        int[] a = new int[n];

	        String[] aItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int aItem = Integer.parseInt(aItems[i]);
	            a[i] = aItem;
	        }

	   LeftRotation rotate = new LeftRotation(); 
	        //int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
	        rotate.leftRotate(a, d, n); 
	        rotate.printArray(a, n);


	        scanner.close();
	    }
	}
