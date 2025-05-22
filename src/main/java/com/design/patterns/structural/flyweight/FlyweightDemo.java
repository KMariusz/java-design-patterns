package com.design.patterns.structural.flyweight;

import java.util.Random;

public class FlyweightDemo {
    private static final int SHAPES_TO_DRAW = 1000;
    private static final ShapeType[] shapeTypes = ShapeType.values();
    private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};
    private static final Random random = new Random();
    
    public static void main(String[] args) {
        System.out.println("\nCreating " + SHAPES_TO_DRAW + " shapes...");
        
        for (int i = 0; i < SHAPES_TO_DRAW; i++) {
            // Get a random shape type
            ShapeType type = shapeTypes[random.nextInt(shapeTypes.length)];
            
            // Get the shape from factory
            Shape shape = ShapeFactory.getShape(type);
            
            // Set random properties
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            int width = random.nextInt(50) + 10;
            int height = random.nextInt(50) + 10;
            String color = colors[random.nextInt(colors.length)];
            
            // Draw the shape
            shape.draw(x, y, width, height, color);
        }
        
        System.out.println("\nTotal shapes created: " + ShapeFactory.getNumberOfShapes());
    }
}
