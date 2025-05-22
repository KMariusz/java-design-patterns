package com.design.patterns.behavioral.state;

import java.util.Scanner;

/**
 * Demo class for the State pattern.
 * This example demonstrates how the State pattern can be used to
 * model a vending machine with different states.
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        // Create a vending machine with 5 products
        VendingMachine vendingMachine = new VendingMachine(5);
        
        System.out.println("Vending Machine Simulator");
        System.out.println("Commands:");
        System.out.println("  insert - Insert a coin");
        System.out.println("  eject - Eject the coin");
        System.out.println("  button - Press the button");
        System.out.println("  refill <number> - Refill the machine with <number> products");
        System.out.println("  state - Show current state");
        System.out.println("  help - Show this help message");
        System.out.println("  exit - Exit the program");
        
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            System.out.print("\n> ");
            String[] input = scanner.nextLine().trim().split("\\s+");
            String command = input[0].toLowerCase();
            
            try {
                switch (command) {
                    case "insert":
                        vendingMachine.insertCoin();
                        vendingMachine.dispense();
                        break;
                        
                    case "eject":
                        vendingMachine.ejectCoin();
                        break;
                        
                    case "button":
                        vendingMachine.pressButton();
                        vendingMachine.dispense();
                        break;
                        
                    case "refill":
                        if (input.length < 2) {
                            System.out.println("Please specify the number of products to add.");
                            break;
                        }
                        int count = Integer.parseInt(input[1]);
                        vendingMachine.refill(count);
                        break;
                        
                    case "state":
                        System.out.println(vendingMachine);
                        break;
                        
                    case "help":
                        System.out.println("Commands:");
                        System.out.println("  insert - Insert a coin");
                        System.out.println("  eject - Eject the coin");
                        System.out.println("  button - Press the button");
                        System.out.println("  refill <number> - Refill the machine with <number> products");
                        System.out.println("  state - Show current state");
                        System.out.println("  help - Show this help message");
                        System.out.println("  exit - Exit the program");
                        break;
                        
                    case "exit":
                        running = false;
                        break;
                        
                    default:
                        System.out.println("Unknown command. Type 'help' for a list of commands.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
        
        System.out.println("Goodbye!");
        scanner.close();
    }
}
