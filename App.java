package warFinal;

public class App {

	public static void main(String[] args) {
		Player one  = new Player("Fred");
		Player two = new Player("Agnes");
		
		Deck deck = new Deck();
	
		for(int i=0; i<52 - 1; i++)
		{
			if (i % 2 != 0) {
				one.draw(deck);
			}else if (i % 2 == 0) {
				two.draw(deck);
			}
		
		for (int g = 0; g < one.hand.size()-1; g++) {
			Card oneCard = one.flip();
			Card twoCard = two.flip();
			System.out.println("One Card: " + oneCard.getValue() + " TwoCard: " + twoCard.getValue());
			if (oneCard.getValue() > twoCard.getValue()) {
				one.incrementScore();
			}
			else if (oneCard.getValue() < twoCard.getValue()) {
				two.incrementScore();
			}else {
				continue;
			}
	
		}
		if (one.score > two.score) {
			System.out.println("Player one wins the game!!");
		}else if (two.score > one.score) {
			System.out.println("Player two wins the game!!");
		}else
		{
			System.out.println("It's a Drqw!");
		
		}
		
	}
	}
}
