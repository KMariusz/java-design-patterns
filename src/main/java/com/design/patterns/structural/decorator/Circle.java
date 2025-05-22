package com.design.patterns.structural.decorator;

/**
 * Concrete implementation of Shape for Circle.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.print("Circle");
    }
}
