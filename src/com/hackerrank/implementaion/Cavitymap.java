package com.hackerrank.implementaion;


	import java.io.*;

	public class Cavitymap {

	    public static void main(String[] args) throws IOException {
	        
	        //INPUT
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        final byte N = Byte.parseByte(br.readLine());
	        final char[][] matrix = new char[N][N];
	        for(byte y = 0; y < N; matrix[y++] = br.readLine().toCharArray()){}
	        br.close();
	        br = null;
	        final byte MAX = (byte)(N-1);
	        for(byte y = 1; y < MAX; ++y){
	            for(byte x = 1; x < MAX; ++x){
	                final char cur = matrix[y][x];
	                if (cur > matrix[y][x+1]){ 
	                    if (cur > matrix[y-1][x] 
	                     && cur > matrix[y][x-1] 
	                     && cur > matrix[y+1][x] 
	                    ){
	                        
	                        matrix[y][x] = 'X';
	                    }
	                    ++x;
	                }
	            }
	        }
	        
	        //OUTPUT
	        final StringBuffer sb = new StringBuffer();
	        for(byte y = 0; y < N;){
	            sb.append(matrix[y]);
	            if (++y < N){
	                sb.append("\n");
	            }
	        }
	        System.out.print(sb);
	    }
	}
