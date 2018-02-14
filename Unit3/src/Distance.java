//� A+ Computer Science  -  www.apluscompsci.com
//Name - Noah Kay
//Date - 2/8/18
//Class - AP CSA
//Lab  - Lab03d

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		setCoordinates(0,0,0,0);

	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1,y1,x2,y2);

	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;


	}

	public void calcDistance()
	{
		distance = Math.pow(Math.pow(xTwo-xOne, 2)+Math.pow(yTwo-yOne, 2), .5);


	}

	public void print( )
	{
		System.out.println("Enter X1 :: " + xOne);
		System.out.println("Enter Y1 :: " + yOne);
		System.out.println("Enter X2 :: " + xTwo);
		System.out.println("Enter Y2 :: " + yTwo);
		System.out.println("distance == " + distance + "\n");


	}
}