package com.design.patterns.structural.decorator;

import java.util.Scanner;

/**
 * Demo class for the Decorator pattern.
 * This example demonstrates how the Decorator pattern can be used to
 * dynamically add responsibilities to objects at runtime.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Let's create your custom coffee.");
        
        // Start with a simple coffee
        Coffee coffee = new SimpleCoffee();
        
        boolean customizing = true;
        while (customizing) {
            System.out.println("\nYour current coffee: " + coffee.getDescription());
            System.out.println("Current cost: $" + String.format("%.2f", coffee.getCost()));
            
            System.out.println("\nAdd a condiment:");
            System.out.println("1. Milk ($0.50)");
            System.out.println("2. Sugar ($0.20)");
            System.out.println("3. Whipped Cream ($0.70)");
            System.out.println("4. Caramel Syrup ($0.60)");
            System.out.println("5. Done customizing");
            System.out.print("Enter your choice (1-5): ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    coffee = new MilkDecorator(coffee);
                    System.out.println("Added milk to your coffee!");
                    break;
                case 2:
                    coffee = new SugarDecorator(coffee);
                    System.out.println("Added sugar to your coffee!");
                    break;
                case 3:
                    coffee = new WhippedCreamDecorator(coffee);
                    System.out.println("Added whipped cream to your coffee!");
                    break;
                case 4:
                    coffee = new CaramelSyrupDecorator(coffee);
                    System.out.println("Added caramel syrup to your coffee!");
                    break;
                case 5:
                    customizing = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        // Final order summary
        System.out.println("\n=== Your Order ===");
        System.out.println("Coffee: " + coffee.getDescription());
        System.out.println("Total Cost: $" + String.format("%.2f", coffee.getCost()));
        System.out.println("Thank you for your order! Enjoy your coffee!");
        
        scanner.close();
    }
}
