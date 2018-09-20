package comp3004.A1;

import junit.framework.TestCase;


public class CardShuffleTest extends TestCase{
	
	public void testCardShuffle() {
		CardDeck tester = new CardDeck();
	
	assertEquals(true, tester.HasShuffled());

}
	
}
