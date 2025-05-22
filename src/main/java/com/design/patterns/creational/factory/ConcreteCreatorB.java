package com.design.patterns.creational.factory;

/**
 * Concrete Creator that creates ConcreteProductB.
 */
public class ConcreteCreatorB extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
