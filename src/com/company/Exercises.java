package com.company;

import java.awt.Color;
import java.awt.color.*;
import java.util.Arrays;
public class Exercises {

	public static void swapFirstLast(int[] a)
	{
		int save = a[0];
		a[0] = a[a.length-1];
		a[a.length-1] = save;
	}
	
	public static char getRandomRps()
	{
		final int numR = 3;
		final int numP = 5;
		final int numS = 6;
		int total = numP+numP+numS;
		
		char [] rps = new char [total];
		
		for(int i = 0; i < numR; i++)
			rps[i] = 'r';
		
		for(int i = numR; i < numR+numP; i++)
			rps[i] = 'p';
		
		for(int i = numP+numR; i < total; i++)
			rps[i] = 's';
		
		for(int i = 0; i < total; i++)
			System.out.print(rps[i]);
		
		int x = (int) (total * Math.random());
		return rps[x];
		
	}
	
	public static boolean isMedian(double [] sample, double m)
	{
		int numless = 0;
		int nummore = 0;
			
		for(double v:sample)
		{
			if (v > m) nummore++;
			else if(v < m) numless++;
		}
		//System.out.println(numless + " " + nummore);
		return(numless == nummore);
	}
	
	public static int [] add(int[] a, int[]b)
	{
		final int N = 15;
		int [] sum = new int[N];
		
		int carry = 0;
		for(int i = N-1; i >= 0; i--)
		{
			int x = a[i]+b[i];
			
			sum[i] = x%10 + carry;
			carry = x/10;
		}
		
		return sum;
	}
	
	public static int[] add2(int[] a, int [] b)
	{
		// make a and and b integers
		int alen = a.length;
		int blen = b.length;
		int int1=0, int2=0, i=alen-1;
		for(int x: a)
		{
			int1 += x * Math.pow(10, i);
			i--;
		}
		//System.out.println(int1);
		
		i = blen-1;
		for(int x: b)
		{
			int2 += x * Math.pow(10, i);
			i--;
		}
		//System.out.println(int2);
		
		int sum = int1 + int2;
		
		int count = 0;
		int y = sum;
		while(y>0)
		{
			y/=10;
			count++;
		}
		
		int [] result = new int[count];
		while(sum>0)
		{
			count--;
			result[count] = sum%10;
			sum/=10;
		}
		
		return result;
	}
	
	public static int[][] pascalTriangle(int n){
		int [][]triangle = new int[n][];
		for(int row = 0; row<triangle.length;row++){
			triangle[row]=new int[row+1];	//Creates separate rows
			triangle[row][0]=1;			// Makes the starting number 1 in each row
			triangle[row][row]=1;		// Makes the last number 1 in each row
			for(int col = 1; col<row; col++){
				triangle[row][col]=triangle[row-1][col]+ //Generates the pyramid
						triangle[row-1][col-1];	
			}
		}//System.out.println(Arrays.deepToString(triangle));
		return triangle;      //Problem
	}

	
	public static void fillCheckerBoard(String [] [] board)
	{
		//Color c1 = Color.black;
		//Color c2 = Color.white;
		String c1 = "black";
		String c2 = "white";
		for(int r = 0; r < board.length; r++)
		{
			int x = board[0].length;
			//System.out.println(board.length + " " + x);
			for(int c = 0; c <= x/2; c+=2)
			{
				board[r][c] = c1;
				board[r][c+1] = c2;
			}
			if(board[0].length %2 !=0)
				board[r][x-1] = c1;
			String temp = c1;
			c1 = c2;
			c2 = temp;
		}
	}
	
	public static double positiveMax(double[][]m)
	{
		double max = 0;
		for(double [] row: m){
			for(double col: row)
			{
				if (col > max)
					max = col;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int [] b = {1,2,3,4};
		for(int i=0; i < b.length; i++)
			System.out.print(b[i] + " ");
		System.out.println();
		swapFirstLast(b);
		for(int i=0; i < b.length; i++)
			System.out.print(b[i] + " ");

		char x = getRandomRps();
		System.out.println("\n" + x);
		*/
		double [] sample = {1.5, 2.7, 3.8, 8.0, 9.5, 24.6, 7.7, -3.8, 8.8};
		System.out.println(isMedian(sample, 7.7)); 
		double [] sample2 = {1.5, 2.7, 3.8, 8.0, 9.5, 24.6, 7.7, -3.8, 8.8};
		System.out.println(isMedian(sample2, 8.0)); 
		double [] sample3 = {1.5, 2.7, 3.8, 8.0, 9.5, 24.6, 7.7, -3.8};
		System.out.println(isMedian(sample3, 7.5)); 
		
		/* add */
		int [] a = {0,0,0,0,0,0,0,0,0,0,0,8,7,6,5};
		int [] b = {0,0,0,0,0,0,0,0,0,0,0,5,4,3,2};
		int [] c = {0,0,0,0,0,0,0,0,0,0,0,0,9,2,6};
		int [] d = add(a,b);
		int [] e = add(a, c);
		for(int i: d)System.out.print(i);
		System.out.println();
		for(int i: e)System.out.print(i);
		System.out.println();
		
		/*  checkerboard */
		String [][] board = new String[4][4];
		fillCheckerBoard(board);
		for (String [] r: board)
		{
			for(String co: r)
			{
				System.out.print(co + " ");
			}
			System.out.println();
		}
		
		/* max */
		double[][] m = {{6.7, 5.2, 10.9, 3.8}, {3.3, 12.9, 5.22, 12.9}, 
				{1.0, 2.2, 4.1, 8.0}};
		double [][] n = {{-1.1, -5.0},{-3.3, -2.6}};
		
		double x = positiveMax(m);
		double y = positiveMax(n);
		//System.out.println(x + " " + y);
		
		//System.out.prin2020tln(Arrays.deepToString(pascalTriangle(7)));
		
	}
		

	

}
