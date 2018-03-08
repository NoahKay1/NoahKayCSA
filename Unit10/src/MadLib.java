//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		


	}

	public MadLib(String fileName)
	{
		//load stuff
		this();
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		
		
		
		try{
			Scanner file = new Scanner(new File(fileName));
		
		
		
		
		
		
		
	
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner file = new Scanner(new File("nouns.dat"));
		
		
		
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File("verbs.dat"));
	
	
	
	
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File("adjectives.dat"));
	
	
	
	
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{
	
		return "";
	}
	
	public String getRandomNoun()
	{
		
		return "";
	}
	
	public String getRandomAdjective()
	{
		
		return "";
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}