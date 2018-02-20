//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		System.out.println("Guessing Game - how many numbers? ");
		Scanner keyboard = new Scanner(System.in);
		int response = keyboard.nextInt();
		GuessingGame g = new GuessingGame(response);
		g.playGame();
		System.out.println(g);
		System.out.println("Do you want to play again? ");
		char c = keyboard.next().charAt(0);
		while (c == 'y'){
				System.out.println("Guessing Game - how many numbers? ");
				response = keyboard.nextInt();
				GuessingGame g1 = new GuessingGame(response);
				g1.playGame();
				System.out.println(g1);
				System.out.println("Do you want to play again? ");
				c = keyboard.next().charAt(0);				
		}



	}
}