package com.hackerrank.greedy;


	import java.io.*;
	import java.util.*;

	public class SherlockandTheBeast {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int T = input.nextInt();
	        StringBuilder output = new StringBuilder("");
	        
	        tests: 
	        for(int t = 0; t < T; t++)
	        {
	            int n = input.nextInt();
	            StringBuilder decentNumber = new StringBuilder("");
	            int fives = 0;
	            int threes = 0;
	            
	            while(n > 0)
	            {
	                if(n % 3 == 0) //n is divisible by 3
	                {
	                    while(n > 0)
	                    {
	                        fives++;
	                        n -= 3;
	                    }
	                }
	                
	                else if(n % 5 == 0) //n is divisible by 5
	                {
	                    threes++;
	                    n -= 5;
	                }
	                else 
	                {
	                    fives++;
	                    n -= 3;
	                }
	                
	            }
	            
	            if(n < 0) 
	                output.append("-1");
	            else //Build the decent number
	            {
	                for(int i = 0; i < fives; i++)
	                    output.append("555");
	                for(int i = 0; i < threes; i++)
	                    output.append("33333");
	            }
	            output.append("\n"); //Move to the next line of output
	        }
	        System.out.println(output);
	    }
	}
