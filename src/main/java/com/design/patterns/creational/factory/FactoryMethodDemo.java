package com.design.patterns.creational.factory;

/**
 * Demo class for the Factory Method pattern.
 * This example demonstrates how the Factory Method pattern can be used to create
 * different types of products without specifying their concrete classes.
 */
public class FactoryMethodDemo {
    
    /**
     * Client code that works with a creator instance.
     */
    public static void clientCode(Creator creator) {
        System.out.println("Client: I'm not aware of the creator's class, but it still works.");
        String result = creator.someOperation();
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        System.out.println("App: Launched with ConcreteCreatorA.");
        Creator creatorA = new ConcreteCreatorA();
        clientCode(creatorA);
        
        System.out.println("");
        
        System.out.println("App: Launched with ConcreteCreatorB.");
        Creator creatorB = new ConcreteCreatorB();
        clientCode(creatorB);
    }
}
