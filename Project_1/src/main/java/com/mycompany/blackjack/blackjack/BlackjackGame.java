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

public class BlackjackGame {
    private final Deck deck;
    private final Player player;
    private final Player dealer;
    private final Scanner scanner;

    public BlackjackGame() {
        deck = new Deck();
        player = new Player("Player");
        dealer = new Player("Dealer");
        scanner = new Scanner(System.in);
    }

    public void startGame() {
        System.out.println("Welcome to Blackjack!");

        while (true) {
            player.clearHand();
            dealer.clearHand();
            deck.shuffle();

            // Initial deal
            player.addCard(deck.dealCard());
            player.addCard(deck.dealCard());
            dealer.addCard(deck.dealCard());
            dealer.addCard(deck.dealCard());

            // Player's turn
            while (true) {
                System.out.println(player);

                // Ensure the dealer's hand is not empty before accessing the first card
                if (!dealer.getHand().isEmpty()) {
                    System.out.println("Dealer's visible card: " + dealer.getHand().get(0));
                }

                if (player.isBust()) {
                    System.out.println("You bust! Dealer wins.");
                    break;
                }

                System.out.println("Do you want to hit or stand? (h/s)");
                String choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("h")) {
                    player.addCard(deck.dealCard());
                } else {
                    break;
                }
            }

            // Dealer's turn
            if (!player.isBust()) {
                while (dealer.getHandValue() < 17) {
                    dealer.addCard(deck.dealCard());
                }

                System.out.println(dealer);

                if (dealer.isBust() || player.getHandValue() > dealer.getHandValue()) {
                    System.out.println("You win!");
                } else if (player.getHandValue() == dealer.getHandValue()) {
                    System.out.println("It's a tie!");
                } else {
                    System.out.println("Dealer wins!");
                }
            }

            System.out.println("Do you want to play again? (y/n)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("Thanks for playing!");
    }

    public static void main(String[] args) {
        BlackjackGame game = new BlackjackGame();
        game.startGame();
    }
}


