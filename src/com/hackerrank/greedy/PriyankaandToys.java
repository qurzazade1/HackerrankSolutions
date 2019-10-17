package com.hackerrank.greedy;


	import java.io.*;
	import java.util.*;

	public class PriyankaandToys {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int n = input.nextInt();
	        int units = 1;
	        int[] toys = new int[n];
	        for(int i = 0; i < n; i++)
	            toys[i] = input.nextInt();
	        
	        Arrays.sort(toys);
	        int currentWeight = toys[0];
	        for(int weight : toys)
	        {
	            if(!(weight <= currentWeight+4))
	            {
	                units++;
	                currentWeight = weight;
	            }
	        }
	        
	        System.out.println(units);
	    }
	}
