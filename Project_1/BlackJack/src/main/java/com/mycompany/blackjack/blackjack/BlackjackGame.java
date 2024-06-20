/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack.blackjack;

/**
 *
 * @author 97798
**/

import java.util.Scanner;

/**
 * The BlackjackGame class represents the main control logic of the Blackjack
 * game.
 */
public class BlackjackGame {
    private final Deck deck; // Represents the deck of cards
    private final Player player; // Represents the player
    private final Player dealer; // Represents the dealer
    private final Scanner scanner; // Used for user input

    /**
     * Constructor to initialize the game .
     * Creates a deck, player, dealer, and scanner for user input.
     */
    public BlackjackGame() {
        deck = new Deck();
        player = new Player("Player");
        dealer = new Player("Dealer");
        scanner = new Scanner(System.in);
    }

    /**
     * Starts the Blackjack game.
     * Manages the game loop, including dealing cards, player's turn, dealer's turn,
     * and outcome determination.
     */
    public void startGame() {
        System.out.println("Welcome to Blackjack!");

        while (true) {
            // Clear hands and shuffle the deck at the start of each game
            player.clearHand();
            dealer.clearHand();
            deck.shuffle();

            // Initial deal: each player gets two cards
            player.addCard(deck.dealCard());
            player.addCard(deck.dealCard());
            dealer.addCard(deck.dealCard());
            dealer.addCard(deck.dealCard());

            // Player's turn
            while (true) {
                System.out.println(player);

                // Display the dealer's visible card
                if (!dealer.getHand().isEmpty()) {
                    System.out.println("Dealer's visible card: " + dealer.getHand().get(0));
                }

                // Check if the player has busted
                if (player.isBust()) {
                    System.out.println("You bust! Dealer wins.");
                    break;
                }

                // Ask the player if they want to hit or stand
                System.out.println("Do you want to hit or stand? (h/s)");
                String choice = scanner.nextLine();

                // If player chooses to hit, deal another card
                if (choice.equalsIgnoreCase("h")) {
                    player.addCard(deck.dealCard());
                } else {
                    // If player stands, end their turn
                    break;
                }
            }

            // Dealer's turn
            if (!player.isBust()) {
                // Dealer hits until their hand value is at least 17
                while (dealer.getHandValue() < 17) {
                    dealer.addCard(deck.dealCard());
                }

                System.out.println(dealer);

                // Determine the outcome of the game
                if (dealer.isBust() || player.getHandValue() > dealer.getHandValue()) {
                    System.out.println("You win!");
                } else if (player.getHandValue() == dealer.getHandValue()) {
                    System.out.println("It's a tie!");
                } else {
                    System.out.println("Dealer wins!");
                }
            }

            // Ask the player if they want to play again
            System.out.println("Do you want to play again? (y/n)");
            String playAgain = scanner.nextLine();

            // If the player chooses not to play again, exit the game loop
            if (!playAgain.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("Thanks for playing!");
    }

    /**
     * Main method to start the Blackjack game.
     *
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        BlackjackGame game = new BlackjackGame();
        game.startGame();
    }
}
