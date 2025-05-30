package com.design.patterns.behavioral.template_method;

/**
 * Concrete implementation of the Game class for Football.
 */
public class Football extends Game {
    @Override
    protected void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }
    
    @Override
    protected void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
    
    @Override
    protected void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
