package com.design.patterns.structural.decorator;

/**
 * Concrete implementation of Shape for Rectangle.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.print("Rectangle");
    }
}
