//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;
	private int test;

	public Prime()
	{
		setPrime(0);
		

	}

	public Prime(int num)
	{
		setPrime(num);

	}

	public void setPrime(int num)
	{
		number = num;

	}

	public boolean isPrime()
	{
		for(int i=2; i<=number/2;i++)
		{
			test = number % i;
			if (test == 0){
				return false;
			}
		}
		return true;
				
		}
	
	

	public String toString()
	{
		String output="";
		if (isPrime())
		{
		output = "" + number + " is prime.\n";
		}
		else
		{
		output = "" + number + " is not prime.\n";
		}






		return output;
	}
}