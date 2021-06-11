package com.company;

public class Purse {
	private Coin[] myCoins;
	private int numCoins;
	private final int MAXCOINS=20;
	
	public Purse()
	{
		myCoins = new Coin[MAXCOINS];
		numCoins = 0;
	}
	
	public boolean addCoin(Coin c)
	{
		if (numCoins >=MAXCOINS) return false;
		myCoins[numCoins] = c;
		numCoins++;
		return true;
	}
	
	public double total()
	{
		double sum = 0.0;
		for(int i = 0; i < numCoins; i++)
		{
			sum += myCoins[i].getValue();
		}
		return sum;
	}
	
	public void listCoins()
	{
		int numPennies = 0, numNickles = 0, numDimes = 0, numQuarters = 0, numDollars = 0;
		
		for(int i = 0; i < numCoins; i++)
		{
			switch (myCoins[i].getName())
			{
			case "penny":
				numPennies++;
				break;
			case "nickle":
				numNickles++;
				break;
			case "dime":
				numDimes++;
				break;
			case "quarter":
				numQuarters++;
				break;
			case "dollar":
				numDollars++;
				break;
			default:
				System.out.println("error");
				break;
			}
		}
		System.out.println(numDollars + " dollars " + numQuarters + " quarters " + numDimes + 
				" dimes " + numNickles + " nickles " + numPennies + " pennies.");
	}

	public static void main(String[] args) {
		Purse p = new Purse();
		Coin[] c  = {new Coin(.25, "quarter"), new Coin(1.0, "dollar"), new Coin(.25, "quarter"), 
				new Coin(.05, "nickle"), new Coin(.10, "dime"), new Coin(.10, "dime"),
				new Coin(.10, "dime"), new Coin(.05, "nickle")};
		
		for(Coin x: c)
		{
			p.addCoin(x);
		}
		
		System.out.println(p.total());
		p.listCoins();

	}

}
