package com.design.patterns.behavioral.strategy;

import java.util.Scanner;

/**
 * Concrete strategy that implements PayPal payment method.
 */
public class PayPalStrategy implements PaymentStrategy {
    private String email;
    private String password;
    
    @Override
    public void collectPaymentDetails() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter PayPal email: ");
            this.email = scanner.nextLine();
            
            System.out.print("Enter PayPal password: ");
            this.password = scanner.nextLine();
        }
    }
    
    @Override
    public boolean pay(int amount) {
        if (isValidAccount()) {
            System.out.println("Paying " + amount + " using PayPal (" + maskEmail() + ")");
            // Actual PayPal payment processing would happen here
            return true;
        }
        return false;
    }
    
    private boolean isValidAccount() {
        // Simple validation - in a real app, this would be more comprehensive
        return email != null && email.contains("@") && 
               password != null && !password.trim().isEmpty();
    }
    
    private String maskEmail() {
        if (email == null || email.isEmpty()) {
            return "****@****";
        }
        
        int atIndex = email.indexOf('@');
        if (atIndex <= 1) {
            return "****@****";
        }
        
        String firstChar = email.substring(0, 1);
        String lastCharBeforeAt = email.substring(atIndex - 1, atIndex);
        String domain = email.substring(atIndex);
        
        return firstChar + "****" + lastCharBeforeAt + domain;
    }
}
