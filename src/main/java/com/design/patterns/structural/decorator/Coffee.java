package com.design.patterns.structural.decorator;

/**
 * Component interface that defines the operations that can be decorated.
 * In this case, it represents a basic coffee.
 */
public interface Coffee {
    /**
     * @return The cost of the coffee
     */
    double getCost();
    
    /**
     * @return The description of the coffee
     */
    String getDescription();
}
