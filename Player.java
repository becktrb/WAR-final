package warFinal;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player {
	ArrayList<Card> hand = new ArrayList<Card>();
	int score;
	String name;

	public Player( String name) {
		
		this.score = 0;
		this.name = name;
	}

	public void describe() {
		System.out.println("Player " + this.name + "Score of " + this.score);
		for (Card c : hand) {
			c.describe();
		}

	}

	public void incrementScore() {
		this.score++;

	}

	public void draw(Deck deck) {
		this.hand.add(deck.draw());

	}

	public Card flip() {
		Card myCard = this.hand.get(0);
		this.hand.remove(0);
		return myCard;
	}

}