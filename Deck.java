package warFinal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	ArrayList<Card> cards = new ArrayList<Card>();
	private static final String[] suits = { "Clubs", "Hearts", "Spades", "Diamonds" };

	private static final String[] names = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Jack", "Queen", "King", "Ace" };

	public Deck() {
		this.createDeck();
	}

	public void createDeck() {
		for (String s : suits) {
			for (int i = 2; i <= 14; i++) {
				String cardName = names[i - 2] + " " + s;
				Card card = new Card(i, cardName);

				this.cards.add(card);
			}
		}
		this.shuffle();
	}

	public Card draw() {
        Card drawCard = this.cards.get(0);
        this.cards.remove(0);
        
		return this.cards.get(0);
	}

	public void shuffle() {
		Collections.shuffle(this.cards);
	}

}
