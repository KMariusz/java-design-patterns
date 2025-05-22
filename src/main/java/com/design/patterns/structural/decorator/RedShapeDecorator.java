package com.design.patterns.structural.decorator;

/**
 * Concrete decorator for adding red color to shapes.
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    
    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
    
    private void setRedBorder(Shape decoratedShape) {
        System.out.println(" with red border");
    }
}
