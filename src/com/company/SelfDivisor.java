package com.company;

import java.util.Arrays;


public class SelfDivisor {
	public static boolean isSelfDivisor(int number)
	{
		int a = number;
		while(a > 0)
		{
			int d = a%10;
			if(d==0 || number%d != 0)
				return false;
			a /=10;
		}
		return true;
	}
	
	public static int [] firstNumSelfDivisors(int start, int num)
	{
		int [] divArr = new int[num];
		
		int count = 0;
		int test = start;
		while(count < num)
		{
			if(isSelfDivisor(test))
			{
				divArr[count]=test;
				count++;
			}
			test++;
		}
		return divArr;
	}

	public static void main(String[] args) {
		
		int a = 128, b = 124, c= 26, d = 101;
		System.out.println(isSelfDivisor(a));
		System.out.println(isSelfDivisor(b));
		System.out.println(isSelfDivisor(c));
		System.out.println(isSelfDivisor(d));
		
		int [] divArr = firstNumSelfDivisors(128, 4);
		System.out.println(Arrays.toString(divArr));
		/*for(int i = 0; i < 4; i++)
			System.out.println(divArr[i]);
*/
	}

}
/*
true
true
false
false
[128, 132, 135, 144]
*/