package com.design.patterns.structural.decorator;

/**
 * Concrete decorator that adds sugar to the coffee.
 */
public class SugarDecorator extends CoffeeDecorator {
    
    /**
     * Constructor that takes a Coffee object to be decorated with sugar.
     * @param coffee The coffee to add sugar to
     */
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public double getCost() {
        return super.getCost() + 0.2; // Adding cost of sugar
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", sugar";
    }
}
