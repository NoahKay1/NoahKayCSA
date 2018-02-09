//� A+ Computer Science  -  www.apluscompsci.com
//Name - Noah Kay
//Date - 2/8/18
//Class - AP CSA
//Lab  - Lab04d

import static java.lang.System.*;

public class Name
{
	private String name;
	private int space;

	public Name()
	{
		setName("");

	}

	public Name(String s)
	{
		setName(s);

	}

   public void setName(String s)
   {
	   name = s;

   }

	public String getFirst()
	{
		
		return name.substring(0,name.indexOf(" "));
	}

	public String getLast()
	{
		return name.substring(name.indexOf(" ")+1);
		
	}

 	public String toString()
 	{
 		return name + "\n\n";
 		
	}
}