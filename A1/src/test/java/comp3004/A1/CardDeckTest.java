package comp3004.A1;

import junit.framework.TestCase;

public class CardDeckTest extends TestCase  {
	
	public void testCardDeck() {
		CardDeck tester = new CardDeck();
		
		assertEquals(52, tester.total());
		
	}

}
