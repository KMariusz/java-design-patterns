package com.design.patterns.structural.facade;

/**
 * Subsystem class for the screen.
 */
public class Screen {
    private String description;
    
    public Screen(String description) {
        this.description = description;
    }
    
    public void up() {
        System.out.println(description + " going up");
    }
    
    public void down() {
        System.out.println(description + " going down");
    }
    
    @Override
    public String toString() {
        return description;
    }
}
