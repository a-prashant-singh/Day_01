package practice_Day13;

import java.util.Random;

public class DeckOfCards {

    // Define the suits and ranks of the cards
    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    private final String[] deck;

    public DeckOfCards() {
        // Initialize the deck with 52 cards
        deck = new String[SUITS.length * RANKS.length];
        initializeDeck();
    }

    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.shuffleDeck();
        String[][] players = deckOfCards.distributeCards();
        deckOfCards.printPlayerCards(players);
    }

    // Initialize the deck with 52 cards
    private void initializeDeck() {
        int index = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }
    }

    // Shuffle the deck using the Random method
    private void shuffleDeck() {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = random.nextInt(deck.length);
            // Swap the cards
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;

        }
        for (String d : deck)
            System.out.println(d);
    }



    // Distribute 9 cards to 4 players
    private String[][] distributeCards() {
        String[][] players = new String[4][3];
        int cardIndex = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Print the cards received by each player
    private void printPlayerCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }
}
