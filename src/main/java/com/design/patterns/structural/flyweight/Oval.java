package com.design.patterns.structural.flyweight;

public class Oval implements Shape {
    private boolean fill;
    
    public Oval(boolean fill) {
        this.fill = fill;
        System.out.println("Creating Oval object with fill=" + fill);
        // Simulate time-consuming object creation
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(int x, int y, int width, int height, String color) {
        System.out.println("Drawing a " + (fill ? "filled" : "unfilled") + 
                         " oval with color " + color + " at [" + x + 
                         ", " + y + "], width: " + width + ", height: " + height);
    }
}
