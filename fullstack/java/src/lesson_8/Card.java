package lesson_8;

public class Card {
    String suit; // "Hearts"
    String rank; // "Jack"
    String color; // "Red"

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
        this.color = this.getColor();
    }

    public void print() {
        System.out.println(this); // Look for a 'toString()' method and invoke it
    }

    public int getValue() {
        if (this.rank.equals("Jack")) {
            return 11;
        } else if (this.rank.equals("Queen")) {
            return 12;
        } else if (this.rank.equals("King")) {
            return 13;
        } else if (this.rank.equals("Ace")) {
            return 14;
        } else {
            return Integer.parseInt(this.rank);
        }
    }

    public void printValue() {
        System.out.println(this.getValue());
    }

    public String toString() {
        return suit + " | " + rank + " | " + color;
    }

    public String getColor() {
        if (this.suit.equals("♡") || this.suit.equals("♢")) {
            return "Red";
        } else if (this.suit.equals("♠") || this.suit.equals("♣")) {
            return "Black";
        } else {
            return null;
        }
    }
}
