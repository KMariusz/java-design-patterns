package com.design.patterns.creational.factory;

/**
 * Another concrete implementation of the Product interface.
 */
public class ConcreteProductB implements Product {
    @Override
    public void use() {
        System.out.println("Using ConcreteProductB");
    }
    
    @Override
    public String getDescription() {
        return "This is ConcreteProductB";
    }
}
