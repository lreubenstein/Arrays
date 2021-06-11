package com.company;

public class Biggest {

	public static int biggest(int [] bigarr) {
		// TODO Auto-generated constructor stub
		int max = bigarr[0];
		for(int x: bigarr) {
			if (x>max) {
				max = x;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test = {3,-2,6,8,20,-1};
		int y = biggest(test);
		System.out.println(y);

	}

}
