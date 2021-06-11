package com.company;

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
//		if(bestRun == 0) return -1;
//		return index;
//	}

	public int getBestRun(int[] values) {

		int currCount = 0;
		int bestCount = 0;
		int currRun = 0;
		int bestRun = 0;

		for (int x = 1; x < values.length; x++) {

			if (values[x] == values[x - 1])             //Checks if value at x is equal to value in space before it.
			{ currCount++; }                        //Increments length of run until run ends.
			else {
				if (currCount > bestCount) {            //Checks if final length of run is longer than previous longest.
					bestCount = currCount;              //Saves length of longest run to compare later.
					bestRun = currRun;                  //Saves location of best run to print to console.
				}
				currCount = 0;                          //Resets count.
				currRun = x;                            //Sets position to test for new run.
			}
		}
		if (currCount > bestCount) {bestRun = currRun;}  //In the case that the best run is at the end of the array.
		return bestRun;
	}



	public static void main(String[] args) {
		RollingDie nc = new RollingDie();

		for (int p = 0; p < 10; p++) {
			int[] tossArr = nc.getRolls(20);
			for (int i = 0; i < 20; i++)
				System.out.print(tossArr[i] + ",");
			System.out.println();

			int x = nc.getBestRun(tossArr);
			System.out.println(x);
		}
		//int [] myarr = {3,4,5,6,3,3,3,3,3,6,3,2,5,3,2,4,2,4,2,1};
		int [] myarr = {3,4,5,6,3,2,3,4,3,6,3,2,5,3,2,4,2,4,1,1};
		for (int i = 0; i < 20; i++)
			System.out.print(myarr[i] + ",");
		System.out.println();
		System.out.println(nc.getBestRun(myarr));
	}

}
