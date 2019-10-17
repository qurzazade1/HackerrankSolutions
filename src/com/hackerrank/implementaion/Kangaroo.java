package com.hackerrank.implementaion;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int x1 = in.nextInt();
	        int v1 = in.nextInt();
	        int x2 = in.nextInt();
	        int v2 = in.nextInt();
	        
	            
	        while(x1 <= x2)
	        	if(x1 == x2)
	            {
	                System.out.println("YES");
	                System.exit(0);//Once they meet we don't need to continue checking
	            }
	            x1 += v1;
	            x2 += v2;
	        }
	    
	      
	    }


