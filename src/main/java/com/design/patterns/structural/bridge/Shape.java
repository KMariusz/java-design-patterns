package com.design.patterns.structural.bridge;

/**
 * Abstraction in Bridge pattern.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    
    public abstract void draw();
}
