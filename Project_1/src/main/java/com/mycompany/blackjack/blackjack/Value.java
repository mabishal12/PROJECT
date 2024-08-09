/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.blackjack.blackjack;

/**
 *
 * @author 97798
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public enum Value {

    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;

    private static final ArrayList<Value> VALUES = new ArrayList<Value>(Arrays.asList(Value.values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Value randomValue() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

}
