/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		int[] vals = new int[] {1,2,3,4,5,6,1,2,3};
		String[] suits = new String[] {"Spade", "Spade", "Clubs", "Clubs", "Diamonds", "Diamonds", "Hearts", "Hearts", "Test"};
		String[] ranks = new String [] {"One", "Two", "Three", "Four", "Five", "Six", "One", "Two", "Three"};
		
		Deck d1 = new Deck(ranks, suits, vals);
		System.out.println(d1);
		d1.deal();
		System.out.println(d1);
		d1.deal();
		System.out.println(d1);
	}
}
