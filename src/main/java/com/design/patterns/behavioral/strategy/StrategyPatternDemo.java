package com.design.patterns.behavioral.strategy;

import java.util.Scanner;

/**
 * Demo class for the Strategy pattern.
 * This example demonstrates how the Strategy pattern can be used to
 * dynamically select different payment methods at runtime.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentContext paymentContext = new PaymentContext();
        
        System.out.println("Welcome to the Payment System");
        System.out.println("1. Pay with Credit Card");
        System.out.println("2. Pay with PayPal");
        System.out.println("3. Pay with Bitcoin");
        System.out.print("Choose payment method (1-3): ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Set the strategy based on user choice
        switch (choice) {
            case 1:
                paymentContext.setPaymentStrategy(new CreditCardStrategy());
                break;
            case 2:
                paymentContext.setPaymentStrategy(new PayPalStrategy());
                break;
            case 3:
                paymentContext.setPaymentStrategy(new BitcoinStrategy());
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                scanner.close();
                return;
        }
        
        // Collect payment details
        System.out.println("\nPlease enter payment details:");
        paymentContext.collectPaymentDetails();
        
        // Process payment
        System.out.print("\nEnter amount to pay: ");
        int amount = scanner.nextInt();
        
        System.out.println("\nProcessing payment...");
        boolean success = paymentContext.processPayment(amount);
        
        if (success) {
            System.out.println("Payment successful! Thank you for your purchase.");
        } else {
            System.out.println("Payment failed. Please try again with valid details.");
        }
        
        scanner.close();
    }
}
