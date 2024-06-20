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

/**
 * The Player class represents a player in a card game like Blackjack.
 */
public class Player {
    private final String name;           // Player's name
    private final ArrayList<Card> hand; // Player's hand of cards

    /**
     * Constructor to create a player with a given name and an empty hand.
     *
     * @param name The name of the player
     */
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>(); // Initialize the player's hand as an empty ArrayList
    }

    /**
     * Adds a card to the player's hand.
     *
     * @param card The card to add to the player's hand
     */
    public void addCard(Card card) {
        hand.add(card); // Add the card to the player's hand ArrayList
    }

    /**
     * Calculates the value of the player's hand.
     * Aces are counted as 11 if the total hand value is less than or equal to 21;
     * otherwise, Aces are counted as 1.
     *
     * @return The value of the player's hand
     */
    public int getHandValue() {
        int value = 0;    // Total value of the hand
        int aceCount = 0; // Count of Aces in the hand

        // Iterate through each card in the hand
        for (Card card : hand) {
            value += card.getValue(); // Add the value of the card to the total value of the hand
            if (card.getRank().equals("Ace")) { // If the card is an Ace
                aceCount++; // Increment the count of Aces
            }
        }

        // Adjust the value if there are Aces in the hand and the total value exceeds 21
        while (value > 21 && aceCount > 0) {
            value -= 10; // Subtract 10 to count the Ace as 1 instead of 11
            aceCount--;  // Decrement the count of Aces
        }

        return value; // Return the total value of the hand
    }

    /**
     * Checks if the player's hand value exceeds 21 (busted).
     *
     * @return True if the player's hand value is greater than 21, false otherwise
     */
    public boolean isBust() {
        return getHandValue() > 21; // Return true if the hand value is greater than 21
    }

    /**
     * Clears the player's hand by removing all cards.
     */
    public void clearHand() {
        hand.clear(); // Clear the hand ArrayList
    }

    /**
     * Gets the player's hand.
     *
     * @return The ArrayList containing the cards in the player's hand
     */
    public ArrayList<Card> getHand() {
        return hand; // Return the ArrayList representing the player's hand
    }

    /**
     * Returns a string representation of the player's hand.
     *
     * @return A string containing the player's name, their hand, and its value
     */
    @Override
    public String toString() {
        return name + "'s hand: " + hand + " (value: " + getHandValue() + ")";
    }
}
