/**
 * Players hand in play
 * @author Karen Mackay
 * @version 1
 */
package com.company;

import java.util.ArrayList;

public class Hand {
    private int totalValue;
    private int nbrCards;
    private ArrayList<Card> playerHand;

    public Hand ()
    {
        playerHand = new ArrayList<Card>();
    }

    public int getNbrCards() {
        return nbrCards;
    }

    public void setNbrCards(int nbrCards) {
        this.nbrCards = nbrCards;
    }


    public int calculateTotalValue(Card dealtCard) {
        int cardValue = calculateCardValue(dealtCard);
        totalValue = totalValue + cardValue;
        return totalValue;
    }

    public int getTotalValue(){
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }

    public ArrayList<Card> getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(ArrayList<Card> handList) {
        this.playerHand = handList;
    }

    public void addCard(Hand handInPlay, Card cardDealt){
        handInPlay.playerHand.add(cardDealt);
        setTotalValue(calculateTotalValue(cardDealt));
    }

    public int calculateCardValue(Card localCard) {
        int value = 0;
        String cardString = localCard.toString();

        if (cardString.startsWith("Ace")) {
            value = 1;
        }
        if (cardString.startsWith("Two")) {
            value = 2;
        }
        if (cardString.startsWith("Three")) {
            value = 3;
        }
        if (cardString.startsWith("Four")) {
            value = 4;
        }
        if (cardString.startsWith("Five")) {
            value = 5;
        }
        if (cardString.startsWith("Six")) {
            value = 6;
        }
        if (cardString.startsWith("Seven")) {
            value = 7;
        }
        if (cardString.startsWith("Eight")) {
            value = 8;
        }
        if (cardString.startsWith("Nine")) {
            value = 9;
        }
        if (cardString.startsWith("Ten")) {
            value = 10;
        }
        if (cardString.startsWith("King")) {
            value = 10;
        }
        if (cardString.startsWith("Queen")) {
            value = 10;
        }
        if (cardString.startsWith("Jack")) {
            value = 10;
        }
        return value;
    }
}
