package com.design.patterns.structural.decorator;

/**
 * Abstract decorator class for Shape.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    
    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
    
    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
