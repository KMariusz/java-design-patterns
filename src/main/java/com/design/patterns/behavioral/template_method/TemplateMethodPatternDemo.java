package com.design.patterns.behavioral.template_method;

/**
 * Demo class for the Template Method pattern.
 * This example demonstrates how the Template Method pattern can be used
 * to define the skeleton of an algorithm in a method, deferring some steps
 * to subclasses.
 */
public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        System.out.println("Template Method Pattern Demo");
        System.out.println("---------------------------");
        
        // Play cricket
        System.out.println("\nPlaying Cricket:");
        Game cricket = new Cricket();
        cricket.play();
        
        // Play football
        System.out.println("\nPlaying Football:");
        Game football = new Football();
        football.play();
    }
}
