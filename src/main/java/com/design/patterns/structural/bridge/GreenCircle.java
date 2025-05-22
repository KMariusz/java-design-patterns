package com.design.patterns.structural.bridge;

/**
 * Concrete implementation of DrawAPI for drawing green circles.
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + 
                         ", x: " + x + ", " + y + "]");
    }
}
