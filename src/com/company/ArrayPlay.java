package com.company;

import java.util.Arrays;

public class ArrayPlay {

	public ArrayPlay() {
		// TODO Auto-generated constructor stub
	}
	
	public static String [] getString() {
		String[] names= new String[5];
		//System.out.println(names[0]);
		names[0]="Jack";
		names[1]="Azim";
		names[2]="Alyssa";
		names[3]=names[0];
		names[0]="Dax";
		return names;
	}
	public static double [] getDoubles() {
		double [] x = {2.3, -4.5, 2.2, 4.9};
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intarr = new int[5];
		intarr[0]=-2;
		intarr[1]=6;
		intarr[2]=4;
		
		System.out.println(intarr);
		for(int i=0; i<intarr.length; i++) {
			System.out.print(intarr[i] + " ");
		}
		System.out.println();
		// another way to print an array
		System.out.println(Arrays.toString(intarr));

		double [] darr = getDoubles();
		for(int i=0; i<darr.length; i++) {
			System.out.print(darr[i] + " ");
		}
		System.out.println();
		
		String [] sarr = getString();
		for(int i=0; i<sarr.length; i++) {
			System.out.print(sarr[i] + " ");
		}
	}

}
