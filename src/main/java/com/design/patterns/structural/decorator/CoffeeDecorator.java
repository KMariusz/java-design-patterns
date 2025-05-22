package com.design.patterns.structural.decorator;

/**
 * Base decorator class that implements the Coffee interface and has a reference to a Coffee object.
 * All concrete decorators will extend this class.
 */
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;
    
    /**
     * Constructor that takes a Coffee object to be decorated.
     * @param coffee The coffee to be decorated
     */
    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }
    
    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
    
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}
