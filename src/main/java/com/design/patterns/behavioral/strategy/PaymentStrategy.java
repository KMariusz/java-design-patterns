package com.design.patterns.behavioral.strategy;

/**
 * The Strategy interface declares operations common to all supported versions
 * of some algorithm. The Context uses this interface to call the algorithm
 * defined by Concrete Strategies.
 */
public interface PaymentStrategy {
    /**
     * Process a payment
     * @param amount The amount to be paid
     * @return true if payment was successful, false otherwise
     */
    boolean pay(int amount);
    
    /**
     * Collect payment details from the user
     */
    void collectPaymentDetails();
}
