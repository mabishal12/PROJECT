/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack.blackjack;

/**
 *
 * @author 97798
 */



import java.util.ArrayList;
import java.util.Collections;

/**
 * The Deck class represents a deck of playing cards.
 */
public final class Deck {
    private final ArrayList<Card> cards; // List to store the cards in the deck

    /**
     * Constructor to initialize the deck with a standard 52-card deck.
     * Creates cards for each combination of suits and ranks, then shuffles the deck.
     */
    public Deck() {
        cards = new ArrayList<>(); // Initialize the list to store cards
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"}; // Array of suit names
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}; // Array of rank names
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11}; // Array of corresponding values for each rank

        // Create cards for each combination of suit and rank
        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                cards.add(new Card(suit, ranks[i], values[i]));
            }
        }

        shuffle(); // Shuffle the deck after creating it
    }

    /**
     * Shuffles the deck by randomly rearranging the cards.
     */
    public void shuffle() {
        Collections.shuffle(cards); // Use the Collections.shuffle method to shuffle the cards
    }

    /**
     * Deals a card from the top of the deck.
     *
     * @return The dealt card
     */
    public Card dealCard() {
        return cards.remove(0); // Remove and return the first card from the deck
    }

    /**
     * Gets the number of remaining cards in the deck.
     *
     * @return The number of remaining cards
     */
    public int remainingCards() {
        return cards.size(); // Return the size of the deck, which represents the number of remaining cards
    }
}


