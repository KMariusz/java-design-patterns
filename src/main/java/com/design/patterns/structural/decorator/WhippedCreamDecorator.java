package com.design.patterns.structural.decorator;

/**
 * Concrete decorator that adds whipped cream to the coffee.
 */
public class WhippedCreamDecorator extends CoffeeDecorator {
    
    /**
     * Constructor that takes a Coffee object to be decorated with whipped cream.
     * @param coffee The coffee to add whipped cream to
     */
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public double getCost() {
        return super.getCost() + 0.7; // Adding cost of whipped cream
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", whipped cream";
    }
}
