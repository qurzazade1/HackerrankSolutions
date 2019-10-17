package com.hackerrank.warmup;


	import java.io.*;
	import java.util.*;
	 
	public class Staircase {

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        for(int i = 1; i <= n; i++) {
	            for(int j = 1; j <= n; j++) {
	                if ((i + j) > n) {
	                    System.out.print("#");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }}
