/**
 * www.rosettacode.org
 */
package com.company;

public class Card {
    private final Suit suit;
    private final Face faceValue;

    public Card(Suit family, Face value)
    {
        suit = family;
        faceValue = value;
    }


    public String toString() {
        return faceValue +  " of " + suit;
    }
}
