package com.hackerrank.sorting;


	import java.io.*;
	import java.util.*;

	public class Quicksort1_Partition {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int n = input.nextInt();
	        int pivot = input.nextInt();
	        StringBuilder greater = new StringBuilder("");
	        for(int i = 1; i < n; i++){
	            int num = input.nextInt();
	            if(num < pivot)
	            {
	                System.out.print(num+" ");
	                continue;
	            }
	            else
	                greater.append(num+" ");
	                
	        }
	        System.out.print(pivot+" "+greater.toString());        
	    }
	}
