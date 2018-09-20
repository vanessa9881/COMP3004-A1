package comp3004.A1;

public class CardDeck {
	int[] cdeck = new int[52];
	String[] suits = {"S", "H", "D", "C"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    

	public int total() {
		
		for (int i = 0; i < cdeck.length; i++) {
		     cdeck[i] = i;
		  }
		 return cdeck.length;
	}
	
}

