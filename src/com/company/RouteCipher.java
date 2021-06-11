package com.company;

import java.util.Arrays;

/**
 * 
 */

/**
 * @author lreubenstein
 *
 */
public class RouteCipher {

	/**
	 * @param args
	 */
	private String [][] letterBlock;
	private int numRows;
	private int numCols;
	
	public RouteCipher(int r, int c)
	{
		letterBlock = new String[r][c];
		numRows = r;
		numCols = c;
	}
	
	/**
	 * 
	 * @param str  string to be processed
	 * Postcondition:
	 * 	if str.length() < numrows*numCols, "A" is placed in each unfilled cell
	 *  if str.length() > numRows*numCols,  trailing characters are ignored
	 */
	private void fillBlock(String str)
	{
		int x = str.length();
		int counter = 0;
		
		for(int i = 0; i < numRows; i++)
		{
			for(int j = 0; j < numCols; j++)
			{
				if(counter > x-1)
					letterBlock[i][j] = "A";
				else
				{
					String sub = str.substring(counter, counter+1);
					letterBlock[i][j] = sub;
				}
					
				counter++;
			}
		}
	}
	
	private String encryptBlock()
	{
		String encr = "";
		
		for(int c = 0; c < numCols; c++)
		{
			for(int r = 0; r < numRows; r++)
			{
				encr += letterBlock[r][c];
			}
		}
		
		return encr;
	}
	
	public String encryptMessage(String message)
	{
		String encr = "";
		int size = numRows*numCols;
		int index = 0;
		int ml = message.length();
		
		while(index < ml)
		{
			int end = Math.min(index + size, ml);
			String bit = message.substring(index, end);
			fillBlock(bit);
			encr += encryptBlock();
			index = end;
			
			//message = message.substring(end);
		}
			
		return encr;
	}
	
	
	public String toString()
	{
		return Arrays.deepToString(letterBlock);
	}
	public void printBlock()
	{
		for(String[] sa:letterBlock)
		{
			for(String s: sa)
				System.out.print(s);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RouteCipher r1 = new RouteCipher(5,3);
		//r1.fillBlock("Born in the USA");
		//System.out.println(r1);
		//r1.printBlock();
		System.out.println(r1.encryptMessage("Born in the USA"));
		
		RouteCipher r2 = new RouteCipher(5,3);
		//r2.fillBlock("Hello World");
		//System.out.println(r2);
		//r2.printBlock();
		System.out.println(r2.encryptMessage("Hello World"));
		
		RouteCipher r3 = new RouteCipher(5,3);
		//r3.fillBlock("The rain in Spain stays mainly in the plain.");
		//System.out.println(r3);
		//r3.printBlock();
		System.out.println(r3.encryptMessage("The rain in Spain stays mainly in the plain"));
		
		RouteCipher r4 = new RouteCipher(2,4);
		System.out.println(r4.encryptMessage("Happy Birthday"));
	}

}
