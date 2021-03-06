//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;
public class Word2 implements Comparable<Word2>
{
	private String word;

	public Word2( String s)
	{
		word = s; 

	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for(int i = 0; i < word.length(); i++) {
			for(int j = 0; j < vowels.length(); j++) {
				if(word.charAt(i) == vowels.charAt(j)) vowelCount++;
			}
		}
		return vowelCount;
	}
	
	public int compareTo(Word2 rhs)
	{
		Word2 other = (Word2)rhs;
		if(numVowels() < other.numVowels()) return 1;
		if(numVowels() > other.numVowels()) return -1;
		for (int i = 0; i < word.length(); i++){
			if ((int)word.charAt(i) < (int)other.toString().charAt(i)){
				return 1;
			}
			else if ((int)word.charAt(i) > (int)other.toString().charAt(i)){
				return -1;
			}
		}
		return 0;


	
	}

	public String toString()
	{
		return word;
	}
}