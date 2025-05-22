package com.design.patterns.behavioral.state;

/**
 * Concrete state representing the state when a product is being dispensed.
 */
public class SoldState implements State {
    
    @Override
    public void handleRequest(Context context) {
        System.out.println("Dispensing product...");
        
        // Decrease the count of products
        int count = context.getCount() - 1;
        context.setCount(count);
        
        if (count > 0) {
            // If there are products left, go back to no coin state
            context.setState(context.getNoCoinState());
        } else {
            // If no products left, go to sold out state
            System.out.println("Out of products!");
            context.setState(context.getSoldOutState());
        }
    }
    
    @Override
    public String toString() {
        return "Sold State";
    }
}
