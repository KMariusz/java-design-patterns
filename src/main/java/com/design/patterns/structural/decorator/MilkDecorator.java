package com.design.patterns.structural.decorator;

/**
 * Concrete decorator that adds milk to the coffee.
 */
public class MilkDecorator extends CoffeeDecorator {
    
    /**
     * Constructor that takes a Coffee object to be decorated with milk.
     * @param coffee The coffee to add milk to
     */
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public double getCost() {
        return super.getCost() + 0.5; // Adding cost of milk
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", milk";
    }
}
