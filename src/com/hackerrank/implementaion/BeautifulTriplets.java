package com.hackerrank.implementaion;

	import java.io.*;
	import java.util.*;
	public class BeautifulTriplets {

	    
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner input = new Scanner(System.in);
	        int n = input.nextInt();
	        int d = input.nextInt();
	        
	        HashMap<Integer,Integer>  values = new HashMap<>();
	        
	        int beautifulTriplets = 0;
	        
	        
	        //Build a set
	        for(int i = 0; i < n; i++)
	        {
	            int x = input.nextInt();
	            
	                values.put(x,values.getOrDefault(x, 0)+1);
	            
	                
	        }
	        
	        
	        //Check if set has a value, value+d, and value + 2d
	        for(Integer digit : values.keySet())
	        {
	            if(values.containsKey(digit+d) && values.containsKey(digit+(2*d)))
	            {
	                beautifulTriplets+=values.get(digit)*values.get(digit+d)*values.get(digit+(2*d));
	            }
	        }
	        
	        System.out.println(beautifulTriplets);
	    }
	}
