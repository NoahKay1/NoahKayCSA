//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\kayn2930\\Desktop\\NoahKayCSA\\Unit12\\src\\lab18d.dat"));
		ArrayList<Word> words = new ArrayList<Word>();
		int size = file.nextInt();
		file.nextLine();
		
		while (file.hasNextLine())
		{
			words.add(new Word(file.nextLine()));
		}
		for(int i = 0; i < size; i++){
			for(int j = 0; j < i; j ++){
				if(words.get(j).compareTo(words.get(i)) == -1)
				{
					Word temp = words.get(j);
					words.set(j, words.get(i));
					words.set(i, temp);
				}
			}
		}
	
		
		for(int i = 0; i < words.size(); i++)
		{
			out.println(words.get(i));
		}
		











	}
}