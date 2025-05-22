package com.design.patterns.structural.flyweight;

public class Line implements Shape {
    public Line() {
        System.out.println("Creating Line object");
        // Simulate time-consuming object creation
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void draw(int x, int y, int width, int height, String color) {
        System.out.println("Drawing a line with color " + color + 
                         " at [" + x + ", " + y + "], width: " + width + 
                         ", height: " + height);
    }
}
