package com.design.patterns.creational.factory;

/**
 * Concrete Creator that creates ConcreteProductA.
 */
public class ConcreteCreatorA extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
