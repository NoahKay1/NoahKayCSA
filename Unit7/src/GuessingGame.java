//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int count;
	private double percent;
	private int answer;
	
	public GuessingGame(int stop)
	{
		upperBound = stop;
		

	}

	public void playGame()
	{
		count = 0;
		Scanner keyboard = new Scanner(System.in);
		answer = (int) (Math.random()*upperBound + 1);
		System.out.println("Enter a number between 1 and " + upperBound);
		int guess = keyboard.nextInt();
		if (guess > upperBound || guess < 1){
			System.out.println("Number out of range!");
		}
		while (guess != answer){
			System.out.println("Enter a number between 1 and " + upperBound);	
			guess = keyboard.nextInt();
			if (guess > upperBound || guess < 1){
				System.out.println("Number out of range!");
			}
			count ++;	
		}
		count ++;
		percent = 100.0 * (1.0 - 1.0/count);
		



	}

	public String toString()
	{
		String output="" + "\n" + "It took " + count + " guesses to guess " + answer + ".\n" + "You guessed wrong " + percent + " percent of the time.";
		return output;
	}
}