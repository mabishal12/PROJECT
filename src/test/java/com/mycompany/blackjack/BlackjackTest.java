/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class BlackjackTest {

    @Test
    public void testHandDoesNotExceed21() {
        Hand hand = new Hand();
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(Value.TEN, Suit.HEARTS));
        cards.add(new Card(Value.QUEEN, Suit.DIAMONDS));
        hand = new Hand(cards);

        assertFalse(hand.exceeded21(), "The hand should not exceed 21");
    }

    @Test
    public void testHandExceeds21() {
        Hand hand = new Hand();
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(Value.KING, Suit.SPADES));
        cards.add(new Card(Value.EIGHT, Suit.CLUBS));
        cards.add(new Card(Value.FOUR, Suit.HEARTS));
        hand = new Hand(cards);

        assertTrue(hand.exceeded21(), "The hand should exceed 21");
    }

    @Test
    public void testHandExactly21() {
        Hand hand = new Hand();
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(Value.ACE, Suit.DIAMONDS));
        cards.add(new Card(Value.KING, Suit.CLUBS));
        hand = new Hand(cards);

        assertFalse(hand.exceeded21(), "The hand should not exceed 21, total value is exactly 21");
    }

}