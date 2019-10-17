package com.hackerrank.implementaion;


	import java.io.*;
	import java.util.*;

	public class BeautifulDaysAtTheMovies {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int i = input.nextInt();
	        int j = input.nextInt();
	        int k = input.nextInt();
	        
	        int beautifulDays = 0;
	        
	        for(int x = i; x <= j; x++)
	        {
	            StringBuilder day = new StringBuilder(String.valueOf(x));
	            int xReverse = Integer.parseInt(day.reverse().toString());
	                
	            if(Math.abs(x-xReverse) % k == 0)
	            {
	                beautifulDays++;
	            }
	        }
	        System.out.println(beautifulDays);
	    }
	}
