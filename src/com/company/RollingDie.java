package com.company;

import java.util.Arrays;

public class RollingDie {
	public int toss()
	{
		return (int)(6 * Math.random()) + 1;
	}
	
	public int[] getRolls(int numTosses)
	{
		int [] tossArr = new int[numTosses];
		
		for(int i = 0; i < numTosses; i++)
		{
			tossArr[i] = toss();
		}
		return tossArr;
	}
	
//	public int getBestRun(int[] values)
//	{
//		int index = -1;
//		int run = 1;
//		int lastNum = values[0];
//		int runIndex = 0;
//		int bestRun = 0;
//
//		for(int i = 1; i < values.length; i++)
//		{
//			if(values[i] == lastNum)
//			{
//				run++;
//				runIndex = i-run+1;
//			}
//			else
//			{
//
//				if(run > bestRun)
//				{
//					bestRun = run;
//					index = runIndex;
//				}
//				run = 1;
//				lastNum = values[i];
//			}
//		}
//		if(bestRun == 1) return -1;
//		return index;
//	}

	public int getBestRun(int[] values) {

		int currCount = 1;
		int bestCount = 1;
		int currRun = 1;
		int bestRun = 1;

		for (int x = 1; x < values.length; x++) {

			if (values[x] == values[x - 1])             //Checks if value at x is equal to value in space before it.
			{ currCount++; }                        //Increments length of run until run ends.
			else {
				if (currCount > bestCount) {            //Checks if final length of run is longer than previous longest.
					bestCount = currCount;              //Saves length of longest run to compare later.
					bestRun = currRun;                  //Saves location of best run to print to console.
				}
				currCount = 1;                          //Resets count.
				currRun = x;                            //Sets position to test for new run.
			}
		}
		if (currCount > bestCount) {
			bestRun = currRun;
			bestCount = currCount;
		}  //In the case that the best run is at the end of the array.

		if(bestCount==1) return -1;
		return bestRun;
	}



	public static void main(String[] args) {
		RollingDie nc = new RollingDie();

		for (int p = 0; p < 10; p++) {
			int[] tossArr = nc.getRolls(20);

			System.out.println(Arrays.toString(tossArr));

			int x = nc.getBestRun(tossArr);
			System.out.println(x);
		}

		int [] myarr = {3,4,5,6,3,2,3,4,3,6,3,2,5,3,2,4,2,1,1,1};
		System.out.println(Arrays.toString(myarr));
		System.out.println(nc.getBestRun(myarr));

		int [] myarr2 = {3,4,5,6,3,2,3,4,3,6,3,2,5,3,2,4,2,4,1,2};
		System.out.println(Arrays.toString(myarr2));
		System.out.println(nc.getBestRun(myarr2));
	}

}
