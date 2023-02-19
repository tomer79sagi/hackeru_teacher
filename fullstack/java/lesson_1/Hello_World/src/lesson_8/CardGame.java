package lesson_8;

public class CardGame {
    public static void main(String[] args) {
        String[] suits = {"♡", "♢", "♠", "♣"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        Card[] deck = new Card[suits.length * ranks.length];

        for (int i=0 ; i<suits.length ; i++) {
            for (int j=0 ; j<ranks.length ; j++) {

                // 0-12
                // 13-25
                // 26-38
                // 39-51
                int index = (ranks.length * i) + j;
                deck[index] = new Card(suits[i], ranks[j]);
                deck[index].print();
            }

            System.out.println("--------------");
        }
    }
}
