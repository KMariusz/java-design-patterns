package com.design.patterns.behavioral.strategy;

/**
 * The Context defines the interface of interest to clients.
 */
public class PaymentContext {
    // The Context maintains a reference to one of the Strategy objects.
    private PaymentStrategy paymentStrategy;
    
    /**
     * Sets the strategy at runtime.
     * @param strategy The payment strategy to use
     */
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }
    
    /**
     * Collects payment details using the current strategy.
     */
    public void collectPaymentDetails() {
        if (paymentStrategy != null) {
            paymentStrategy.collectPaymentDetails();
        } else {
            System.out.println("No payment method selected.");
        }
    }
    
    /**
     * Processes the payment using the current strategy.
     * @param amount The amount to be paid
     * @return true if payment was successful, false otherwise
     */
    public boolean processPayment(int amount) {
        if (paymentStrategy != null) {
            return paymentStrategy.pay(amount);
        } else {
            System.out.println("No payment method selected.");
            return false;
        }
    }
}
