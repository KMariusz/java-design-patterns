package com.design.patterns.behavioral.template_method;

/**
 * Concrete implementation of the Game class for Cricket.
 */
public class Cricket extends Game {
    @Override
    protected void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }
    
    @Override
    protected void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
    
    @Override
    protected void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
