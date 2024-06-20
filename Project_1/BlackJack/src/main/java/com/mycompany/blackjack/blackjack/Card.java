/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack.blackjack;

/**
 *
 * @author 97798
 */

   

/**
 * The Card class represents a playing card with a suit, rank, and value.
 */
public class Card {

    private final String suit; // The suit of the card (e.g., "Hearts", "Diamonds")
    private final String rank; // The rank of the card (e.g., "Ace", "King", "2")
    private final int value;   // The value of the card (e.g., 11 for Ace, 10 for face cards)

    /**
     * Constructor to initialize a card with a suit, rank, and value.
     *
     * @param suit The suit of the card (e.g., "Hearts", "Diamonds")
     * @param rank The rank of the card (e.g., "Ace", "King", "2")
     * @param value The value of the card (e.g., 11 for Ace, 10 for face cards)
     */
    public Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    /**
     * Gets the suit of the card.
     *
     * @return The suit of the card
     */
    public String getSuit() {
        return suit;
    }

    /**
     * Gets the rank of the card.
     *
     * @return The rank of the card
     */
    public String getRank() {
        return rank;
    }

    /**
     * Gets the value of the card.
     *
     * @return The value of the card
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns a string representation of the card in the format "rank of suit".
     *
     * @return A string representation of the card
     */
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}



