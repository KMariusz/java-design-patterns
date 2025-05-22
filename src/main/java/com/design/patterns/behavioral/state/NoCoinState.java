package com.design.patterns.behavioral.state;

/**
 * Concrete state representing the state when no coin is inserted.
 */
public class NoCoinState implements State {
    
    @Override
    public void handleRequest(Context context) {
        System.out.println("Please insert a coin first");
    }
    
    @Override
    public String toString() {
        return "No Coin State";
    }
}
