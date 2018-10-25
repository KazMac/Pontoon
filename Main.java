/**
 * Main application for Pontoon
 * @author Karen Mackay
 * @version 1
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner kboard = new Scanner(System.in);
        Deck pontoonDeck = new Deck();
	    pontoonDeck.shuffle();

	    String choice = "";

	    Punter player1 = new Punter("Karen");
	    Dealer house = new Dealer();

	    player1.twist(player1.getPlayHand(),pontoonDeck.deal());
        player1.twist(player1.getPlayHand(),pontoonDeck.deal());
        System.out.println("Total hand = " + player1.getPlayHand().getTotalValue());
        System.out.println("Total chips = " + player1.getNbrChips());
        System.out.println("Do you wish to Buy (B), Twist (T) or Stick (S)?");
        choice = kboard.nextLine();

        while(choice.equalsIgnoreCase("b") || choice.equalsIgnoreCase("t") )
        {
            switch (choice.toUpperCase()){
            case "B":
                player1.buy(player1.getPlayHand(),pontoonDeck.deal());
                break;
            case "T":
                player1.twist(player1.getPlayHand(),pontoonDeck.deal());
                break;
            case "S":
                break;
            default:
                break;
            }
            System.out.println("Total hand = " + player1.getPlayHand().getTotalValue());
            System.out.println("Total chips = " + player1.getNbrChips());
            System.out.println("Do you wish to Buy (B), Twist (T) or Stick (S)?");
            choice = kboard.nextLine();
        }
        kboard.close();

        house.twist(house.getPlayHand(),pontoonDeck.deal());
        house.twist(house.getPlayHand(),pontoonDeck.deal());
        while(house.getPlayHand().getTotalValue() < 16){
            house.twist(house.getPlayHand(),pontoonDeck.deal());
        }
        System.out.println("Dealer has " + house.getPlayHand().getTotalValue());

    }
}
