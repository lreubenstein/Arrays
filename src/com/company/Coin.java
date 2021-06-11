package com.company;

public class Coin {
	private double myValue;
	private String myName;
	
	public Coin(double value, String name)
	{
		myValue = value;
		myName = name;
	}
	public double getValue()
	{
		return myValue;
	}
	
	public String getName()
	{
		return myName;
	}
	
	
}
