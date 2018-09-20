package comp3004.A1;

public class CardDeck {
	int[] cdeck = new int[52];
	String[] suits = {"S", "H", "D", "C"};
    String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    

	public int total() {
		
		for (int i = 0; i < cdeck.length; i++) {
		     cdeck[i] = i;
		  }
		 return cdeck.length;
	}
	
	public boolean HasShuffled() {
		for (int i = 0; i < cdeck.length; i++) {
		      int index = (int)(Math.random() * cdeck.length);
		      int temp = cdeck[i];
		      cdeck[i] = cdeck[index];
		      cdeck[index] = temp;
		    }
		return true;
		
}

}