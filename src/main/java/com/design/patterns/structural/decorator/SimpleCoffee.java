package com.design.patterns.structural.decorator;

/**
 * Concrete component that implements the Coffee interface.
 * Represents a simple coffee without any condiments.
 */
public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 2.0; // Base price for a simple coffee
    }
    
    @Override
    public String getDescription() {
        return "Simple coffee";
    }
}
