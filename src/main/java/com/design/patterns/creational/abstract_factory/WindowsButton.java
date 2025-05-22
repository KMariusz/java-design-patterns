package com.design.patterns.creational.abstract_factory;

/**
 * Concrete Product: Windows Button
 */
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Windows style button");
    }
    
    @Override
    public void onClick() {
        System.out.println("Windows button clicked!");
    }
}
