//� A+ Computer Science  -  www.apluscompsci.com
//Name - Noah Kay
//Date - 2/8/18
//Class - APCSA
//Lab  - Lab02g

public class Fahrenheit
{
	private double fahrenheit;
	private double celsius;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		
		celsius = (fahrenheit - 32)*(5.0/9);
		return celsius;
	}

	public void print()
	{
		System.out.println(fahrenheit + " degress Fahrenheit == " + getCelsius() + " degrees Celsius");
	}
}