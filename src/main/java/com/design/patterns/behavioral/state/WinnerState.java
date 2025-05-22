package com.design.patterns.behavioral.state;

/**
 * Concrete state representing the state when a customer wins a second product.
 */
public class WinnerState implements State {
    
    @Override
    public void handleRequest(Context context) {
        System.out.println("YOU'RE A WINNER! You get two products for your coin!");
        
        // Dispense two products
        System.out.println("Dispensing first product...");
        System.out.println("Dispensing second product...");
        
        // Decrease the count by 2
        int count = context.getCount() - 2;
        context.setCount(count);
        
        if (count > 0) {
            context.setState(context.getNoCoinState());
        } else {
            System.out.println("Out of products!");
            context.setState(context.getSoldOutState());
        }
    }
    
    @Override
    public String toString() {
        return "Winner State";
    }
}
