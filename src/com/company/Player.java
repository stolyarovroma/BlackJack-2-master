package com.company;

/**
 * Created by falyanguzov on 14.11.2016.
 */
public abstract class Player {
    Hand hand = new Hand();
    private Intellect intellect;
    int wallet = 500;
    String name;
    PlayerState state = PlayerState.IN_GAME;

    public int makeBet(){
        this.wallet -= 100;
        return 100;
    }

    public Player(String name, Intellect intellect) {
        this.intellect = intellect;
        this.name = name;
    }

    public void take(Card current) {
        hand.add(current);
    }

    public Command decision() {

        int score = hand.getScore();
        if(score>21)
            return Command.STAND;
        return intellect.decide(score);

    }
}
