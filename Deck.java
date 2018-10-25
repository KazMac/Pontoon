/**
 * www.rosettacode.org
 */
package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class Deck {
    private final LinkedList<Card> deck = new LinkedList<Card>();

    public Deck()
    {
        for(Suit family : Suit.values())
            for(Face value : Face.values())
                deck.add(new Card(family, value));
    }

    public Card deal()
    {
        return deck.poll();
    }

    public void shuffle()
    {
        Collections.shuffle(deck);
    }

    public String toString() {
        return deck.toString();
    }
}
