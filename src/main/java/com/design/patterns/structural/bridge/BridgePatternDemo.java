package com.design.patterns.structural.bridge;

/**
 * Demo class for the Bridge pattern.
 * This example demonstrates how the Bridge pattern can be used
 * to separate abstraction from implementation.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        System.out.println("Bridge Pattern Demo");
        System.out.println("------------------");
        
        // Create different drawing APIs
        DrawAPI redCircle = new RedCircle();
        DrawAPI greenCircle = new GreenCircle();
        
        // Create different shapes with different drawing APIs
        Shape redCircleShape = new Circle(100, 100, 10, redCircle);
        Shape greenCircleShape = new Circle(100, 100, 10, greenCircle);
        
        // Draw the shapes
        System.out.println("Drawing circles with different colors:");
        redCircleShape.draw();
        greenCircleShape.draw();
        
        // Now let's create circles with different positions and sizes
        System.out.println("\nDrawing circles at different positions and sizes:");
        Shape bigRedCircle = new Circle(200, 200, 50, redCircle);
        Shape smallGreenCircle = new Circle(50, 50, 5, greenCircle);
        
        bigRedCircle.draw();
        smallGreenCircle.draw();
    }
}
