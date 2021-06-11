package com.company;

public class ForEach {

	public ForEach() {
		// TODO Auto-generated constructor stub
	}

	public static void printPlusOne(int [] nums)
	{
		for(int x: nums){
			if(x != 11)
				System.out.print(x+1 + " ");
		}
		System.out.println();
	}
	
	public static void addone(int [] nums) {
		for(int x:nums) {
			x++;
		}
		for(int x: nums) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	public static double max(double[] nums) {
		double max = nums[0];
		for(double y:nums) {
			if (y>max) {
				max=y;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {3,5,7,9,11,13};
		printPlusOne(numbers);
		addone(numbers);
		double [] doubles = {8.3, 6.1, -3.7, 19.5, 2.7};
		System.out.println(max(doubles));
	}

}
