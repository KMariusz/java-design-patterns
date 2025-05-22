package com.design.patterns.behavioral.strategy;

import java.util.Scanner;

/**
 * Concrete strategy that implements credit card payment method.
 */
public class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String expiryDate;
    private String cvv;
    private String nameOnCard;
    
    @Override
    public void collectPaymentDetails() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter card number: ");
            this.cardNumber = scanner.nextLine();
            
            System.out.print("Enter expiry date (MM/YY): ");
            this.expiryDate = scanner.nextLine();
            
            System.out.print("Enter CVV: ");
            this.cvv = scanner.nextLine();
            
            System.out.print("Enter name on card: ");
            this.nameOnCard = scanner.nextLine();
        }
    }
    
    @Override
    public boolean pay(int amount) {
        if (isValidCard()) {
            System.out.println("Paying " + amount + " using Credit Card (" + maskCardNumber() + ")");
            // Actual payment processing would happen here
            return true;
        }
        return false;
    }
    
    private boolean isValidCard() {
        // Simple validation - in a real app, this would be more comprehensive
        return cardNumber != null && !cardNumber.trim().isEmpty() && 
               expiryDate != null && !expiryDate.trim().isEmpty() &&
               cvv != null && cvv.length() >= 3 &&
               nameOnCard != null && !nameOnCard.trim().isEmpty();
    }
    
    private String maskCardNumber() {
        if (cardNumber == null || cardNumber.length() < 4) {
            return "****";
        }
        return "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
    }
}
