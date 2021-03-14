package warFinal;

public class Card {
	public int value;
	public String name;

	public Card(int value, String name) {
		setValue(value);
		setName(name);
	}

	public void describe() {
		System.out.println("Your card is the " + this.value + "of " + this.name);

	}

	public int getValue() {
		return value;
	}

	public void setValue(int x) {
		this.value = x;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
