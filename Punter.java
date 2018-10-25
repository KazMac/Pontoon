/**
 * Punter Subclass of Player
 * @author Karen
 * @version 1
 */
package com.company;

public class Punter extends Player {
    static final int START_NBR_CHIPS = 20;
    static final int BET_NBR_CHIPS = 2;
    private String name;

    public Punter(String userName)
    {
        super(START_NBR_CHIPS);
        name = userName;
    }

    /**
     * place bet
     *
     */
    public void placeBet()
    {
        super.setNbrChips(super.getNbrChips()-BET_NBR_CHIPS);
    }

    /**
     * buy
     * @Param buyCard card dealt
     */
    public void buy(Hand handInPlay, Card buyCard)
    {
        placeBet();
        handInPlay.addCard(handInPlay, buyCard);
        setPlayHand(handInPlay);
    }
}
