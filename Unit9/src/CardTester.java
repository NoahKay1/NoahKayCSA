/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1 = new Card("Queen", "Hearts", 10);
		Card c2 = new Card("2", "Spades", 2);
		Card c3 = new Card ("5", "Diamonds", 5);
		c1.matches(c2);
		c1.matches(c3);
		c1.matches(c1);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		int[] vals = new int[] {1,2,3,4,5,6,1,2,3};
		String[] suits = new String[] {"Spade", "Spade", "Clubs", "Clubs", "Diamonds", "Diamonds", "Hearts", "Hearts", "Test"};
		String[] ranks = new String [] {"One", "Two", "Three", "Four", "Five", "Six", "One", "Two", "Three"};
		
		Deck d1 = new Deck(ranks, suits, vals);
		System.out.println(d1);
		d1.deal();
		System.out.println(d1);
		
	}
}
