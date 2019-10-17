package com.hackerrank.implementaion;


	import java.util.Scanner;
	import java.util.Arrays;
	public class ElectronicsShop {

	    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
	        Arrays.sort(keyboards);
	        Arrays.sort(drives);   
	        int max = -1;
	        int i = 0;
	        int j = drives.length - 1;
	        while (i < keyboards.length && j >= 0) { // O(n + m) time complexity
	            int cost = keyboards[i] + drives[j];
	            if (cost > b) {
	                j--; // look for a cheaper hard drive
	            } else {
	                if (cost > max) {
	                    max = cost;
	                }
	                i++; // look for a more expensive keyboard
	            }
	        }
	        return max;
	    }

	    public static void main(String[] args) {
	        /* Save input */
	        Scanner scan = new Scanner(System.in);
	        int s = scan.nextInt();
	        int n = scan.nextInt();
	        int m = scan.nextInt();
	        int[] keyboards = new int[n];
	        for (int i = 0; i < n; i++) {
	            keyboards[i] = scan.nextInt();
	        }
	        int[] drives = new int[m];
	        for (int i = 0; i < m; i++) {
	            drives[i] = scan.nextInt();
	        }
	        scan.close();
	        
	        /* Calculate result */
	        int moneySpent = getMoneySpent(keyboards, drives, s);
	        System.out.println(moneySpent);
	    }
	}

