package com.design.patterns.creational.factory;

/**
 * A concrete implementation of the Product interface.
 */
public class ConcreteProductA implements Product {
    @Override
    public void use() {
        System.out.println("Using ConcreteProductA");
    }
    
    @Override
    public String getDescription() {
        return "This is ConcreteProductA";
    }
}
