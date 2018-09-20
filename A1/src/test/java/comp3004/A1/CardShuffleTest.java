package comp3004.A1;

import static org.junit.Assert.assertArrayEquals;
import junit.framework.TestCase;


public class CardShuffleTest extends TestCase{
	
	public void testCardShuffle() {
		CardShuffleTest tester = new CardShuffleTest();
	for (int i = 0; i < cdeck.length; i++) {
	      int index = (int)(Math.random() * cdeck.length);
	      int temp = cdeck[i];
	      cdeck[i] = cdeck[index];
	      cdeck[index] = temp;
	    }
	assertArrayEquals(true, tester.HasShuffled);

}
	
}
