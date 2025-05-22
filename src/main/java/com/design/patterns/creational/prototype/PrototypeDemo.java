package com.design.patterns.creational.prototype;

import java.util.Scanner;

/**
 * Demo class for the Prototype pattern.
 * This example demonstrates how the Prototype pattern can be used
 * to create new objects by copying existing ones (prototypes).
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        // Initialize the prototype registry
        PrototypeRegistry registry = new PrototypeRegistry();
        registry.loadDefaults();
        
        System.out.println("Prototype Pattern Demo");
        System.out.println("----------------------");
        
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nAvailable prototypes:");
                System.out.println("1. Developer");
                System.out.println("2. Manager");
                System.out.println("3. Admin");
                System.out.println("4. Exit");
                System.out.print("Select a prototype to clone (1-4): ");
                
                String choice = scanner.nextLine().trim();
                
                if (choice.equals("4")) {
                    System.out.println("Exiting...");
                    break;
                }
                
                String prototypeKey = getPrototypeKey(choice);
                if (prototypeKey == null) {
                    System.out.println("Invalid choice. Please try again.");
                    continue;
                }
                
                // Get the prototype and create a clone
                Prototype prototype = registry.getPrototype(prototypeKey);
                if (prototype == null) {
                    System.out.println("Failed to create prototype. Please try again.");
                    continue;
                }
                
                // Customize the clone
                System.out.print("Enter employee name: ");
                String name = scanner.nextLine().trim();
                
                int id = 0;
                boolean validId = false;
                while (!validId) {
                    try {
                        System.out.print("Enter employee ID: ");
                        id = Integer.parseInt(scanner.nextLine().trim());
                        validId = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number for ID.");
                    }
                }
                
                prototype.customize(name, id);
                
                // Display the cloned and customized prototype
                System.out.println("\n--- Cloned Employee ---");
                prototype.display();
                
                // If it's an Employee, demonstrate adding/removing access rights
                if (prototype instanceof Employee) {
                    Employee employee = (Employee) prototype;
                    System.out.println("\n--- Modifying Access Rights ---");
                    System.out.println("Current access rights: " + 
                                     String.join(", ", ((Employee) prototype).getAccessRights()));
                    
                    System.out.print("Add an access right (or press Enter to skip): ");
                    String rightToAdd = scanner.nextLine().trim();
                    if (!rightToAdd.isEmpty()) {
                        employee.addAccessRight(rightToAdd);
                        System.out.println("Added access right: " + rightToAdd);
                    }
                    
                    System.out.print("Remove an access right (or press Enter to skip): ");
                    String rightToRemove = scanner.nextLine().trim();
                    if (!rightToRemove.isEmpty()) {
                        employee.removeAccessRight(rightToRemove);
                        System.out.println("Removed access right: " + rightToRemove);
                    }
                    
                    System.out.println("\n--- Updated Employee ---");
                    employee.display();
                }
            }
        }
    }
    
    private static String getPrototypeKey(String choice) {
        return switch (choice) {
            case "1" -> "developer";
            case "2" -> "manager";
            case "3" -> "admin";
            default -> null;
        };
    }
}
