package com.design.patterns.creational.builder;

import java.util.Scanner;

/**
 * Demo class for the Builder pattern.
 * This example demonstrates how the Builder pattern can be used to
 * create different computer configurations in a step-by-step manner.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComputerDirector director = new ComputerDirector();
        
        System.out.println("Welcome to the Computer Configuration System!");
        
        // Get basic computer specs
        System.out.print("\nEnter HDD specification (e.g., 1TB SSD): ");
        String hdd = scanner.nextLine();
        
        System.out.print("Enter RAM specification (e.g., 16GB DDR4): ");
        String ram = scanner.nextLine();
        
        System.out.println("\nChoose a computer type to configure:");
        System.out.println("1. Custom Configuration");
        System.out.println("2. Office Computer (Pre-configured)");
        System.out.println("3. Gaming Computer (Pre-configured)");
        System.out.println("4. Developer Computer (Pre-configured)");
        System.out.print("Enter your choice (1-4): ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        Computer computer;
        
        switch (choice) {
            case 1:
                // Build a custom computer
                System.out.println("\n=== Custom Computer Configuration ===");
                
                System.out.print("Enter processor (default: Intel Core i5): ");
                String processor = scanner.nextLine();
                if (processor.trim().isEmpty()) {
                    processor = "Intel Core i5";
                }
                
                System.out.print("Enter operating system (default: Windows 10): ");
                String os = scanner.nextLine();
                if (os.trim().isEmpty()) {
                    os = "Windows 10";
                }
                
                System.out.print("Include graphics card? (y/n, default: n): ");
                boolean hasGraphicsCard = scanner.nextLine().equalsIgnoreCase("y");
                
                System.out.print("Enable Bluetooth? (y/n, default: n): ");
                boolean hasBluetooth = scanner.nextLine().equalsIgnoreCase("y");
                
                // Build the computer using the builder
                computer = new Computer.ComputerBuilder(hdd, ram)
                        .setProcessor(processor)
                        .setOperatingSystem(os)
                        .setGraphicsCardEnabled(hasGraphicsCard)
                        .setBluetoothEnabled(hasBluetooth)
                        .build();
                break;
                
            case 2:
                // Build an office computer using the director
                System.out.println("\n=== Office Computer Configuration ===");
                computer = director.buildBasicOfficeComputer(hdd, ram);
                break;
                
            case 3:
                // Build a gaming computer using the director
                System.out.println("\n=== Gaming Computer Configuration ===");
                computer = director.buildGamingComputer(hdd, ram);
                break;
                
            case 4:
                // Build a developer computer using the director
                System.out.println("\n=== Developer Computer Configuration ===");
                computer = director.buildDeveloperComputer(hdd, ram);
                break;
                
            default:
                System.out.println("Invalid choice. Building a default computer.");
                computer = new Computer.ComputerBuilder(hdd, ram).build();
        }
        
        // Display the final computer configuration
        System.out.println("\n=== Your Computer Configuration ===");
        System.out.println(computer);
        
        scanner.close();
    }
}
