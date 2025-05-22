package com.design.patterns.structural.bridge;

/**
 * Concrete implementation of DrawAPI for drawing red circles.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + 
                         ", x: " + x + ", " + y + "]");
    }
}
