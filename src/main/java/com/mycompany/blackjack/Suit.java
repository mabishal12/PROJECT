/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack;

/**
 *
 * @author 97798
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public enum Suit {
    DIAMONDS,
    CLUBS,
    HEARTS,
    SPADES;

    private static final ArrayList<Suit> SUITS = new ArrayList<Suit>(Arrays.asList(Suit.values()));
    private static final int SIZE = SUITS.size();
    private static final Random RANDOM = new Random();

    public static Suit randomSuit() {
        return SUITS.get(RANDOM.nextInt(SIZE));
    }
}
