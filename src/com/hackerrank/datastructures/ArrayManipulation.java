package com.hackerrank.datastructures;

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class ArrayManipulation {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int N = scan.nextInt();
	        int M = scan.nextInt();
	        
	       
	        long [] array = new long[N + 1];
	        while (M-- > 0) {
	            int a = scan.nextInt();
	            int b = scan.nextInt();
	            int k = scan.nextInt();
	            array[a-1] += k;
	            array[b]   -= k; 
	        }
	        scan.close();
	        
	      
	        long sum = 0;
	        long max = 0;
	        for (int i = 0; i < N; i++) {
	            sum += array[i];
	            max = Math.max(max, sum);
	        }
	        
	        System.out.println(max);
	    }
	}
