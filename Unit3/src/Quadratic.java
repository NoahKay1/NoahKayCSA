//� A+ Computer Science  -  www.apluscompsci.com
//Name - Noah Kay
//Date - 2/8/18
//Class - APCSA
//Lab  - Lab03c

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		setEquation(0,0,0);
		

	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		setEquation(quadA, quadB, quadC);

	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;

 	}

	public void calcRoots( )
	{
		rootOne = (-b + Math.pow(b*b - 4*a*c, .5))/(2*a);
		rootTwo = (-b - Math.pow(b*b - 4*a*c, .5))/(2*a);
	}

	public void print( )
	{
		System.out.println("Enter a :: " + a);
		System.out.println("Enter b :: " + b);
		System.out.println("Enter c :: " + c + "\n");
		System.out.println("rootone :: " + rootOne);
		System.out.println("roottwo :: " + rootTwo);

	}
}