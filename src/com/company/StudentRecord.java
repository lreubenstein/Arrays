package com.company;

public class StudentRecord {

	private int [] scores;
	
	public StudentRecord(int [] s)
	{
		scores = s;
	}
	private double average(int first, int last)
	{
		int sum = 0;
		for(int i = first; i <= last; i++)
		{
			sum += scores[i];
		}
		return (double)sum/(last-first+1);
	}
	
//	private boolean hasImproved()
//	{
//		for(int i=1; i < scores.length; i++)
//		{
//			if(scores[i]<scores[i-1])
//				return false;
//		}
//		return true;
//	}
public boolean hasImproved() {
	boolean ifTrue = false;
	for (int counter = 0; counter < scores.length - 1; counter++) {
		if (scores[counter] <= scores[counter+1]) {
			ifTrue = true;     //????
		}
		else ifTrue = false;
	}
	return ifTrue;
}


	public double finalAverage()
	{
		int len = scores.length;
		if(hasImproved())
		{
			int index = len/2;
			return average(index, len-1);
		}
		
		return average(0, len-1);
	}
	public static void main(String[] args) {
		int [] s1 = {50,50,20,80,53};
		int [] s2 = {20,50,50,53,80};  // give better examples
		int [] s3 = {20,50,50,85};
		int [] s4 = {35, 50, 45, 60,62};
		
		StudentRecord sr1 = new StudentRecord(s1);
		// test average method
		System.out.println(sr1.average(1,4));  // answer should be 50.75
		System.out.println(sr1.finalAverage());
		System.out.println(sr1.hasImproved());
		StudentRecord sr2 = new StudentRecord(s2);
		System.out.println(sr2.finalAverage());
		StudentRecord sr3 = new StudentRecord(s3);
		System.out.println(sr3.finalAverage());
		StudentRecord sr4 = new StudentRecord(s4);
		System.out.println(sr4.hasImproved());
		System.out.println(sr4.finalAverage());
	}

}
/*
50.75
50.6
61.0
67.5
*/