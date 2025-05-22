package com.design.patterns.behavioral.state;

import java.util.Random;

/**
 * Concrete state representing the state when a coin is inserted.
 */
public class HasCoinState implements State {
    private Random randomWinner = new Random(System.currentTimeMillis());
    
    @Override
    public void handleRequest(Context context) {
        System.out.println("You inserted a coin");
        
        // 10% chance to win a second product
        int winner = randomWinner.nextInt(10);
        if (winner == 0 && context.getCount() > 1) {
            context.setState(context.getWinnerState());
        } else {
            context.setState(context.getSoldState());
        }
    }
    
    @Override
    public String toString() {
        return "Has Coin State";
    }
}
