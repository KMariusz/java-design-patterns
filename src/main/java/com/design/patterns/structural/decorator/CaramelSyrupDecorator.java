package com.design.patterns.structural.decorator;

/**
 * Concrete decorator that adds caramel syrup to the coffee.
 */
public class CaramelSyrupDecorator extends CoffeeDecorator {
    
    /**
     * Constructor that takes a Coffee object to be decorated with caramel syrup.
     * @param coffee The coffee to add caramel syrup to
     */
    public CaramelSyrupDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public double getCost() {
        return super.getCost() + 0.6; // Adding cost of caramel syrup
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", caramel syrup";
    }
}
