//© A+ Computer Science  -  www.apluscompsci.com
//Name - Noah Kay
//Date - 2/6/18
//Class - AP CSA
//Lab  - Lab02e

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{radius = rad;
	}

	public void calculateArea( )
	{area = Math.PI * Math.pow(radius, 2);
	}

	public void print( )
	{System.out.println("The area is :: " + area);
	}
}