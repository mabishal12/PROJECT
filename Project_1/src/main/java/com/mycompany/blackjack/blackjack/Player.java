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
import java.util.Scanner;

/**
 * The Player class represents a player in a card game like Blackjack.
 */
public class Player {

    String name; // the unique name for this player
    Hand hand = new Hand();

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public boolean drawACardOrNot() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want to draw one more card?(Y/N)");
            String drawcard = sc.next();
            if (drawcard.equalsIgnoreCase("Y")) {
                return true;
            } else if (drawcard.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("Please enter valid answer!");
            }
        }
    }
}
