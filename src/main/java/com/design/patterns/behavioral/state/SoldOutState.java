package com.design.patterns.behavioral.state;

/**
 * Concrete state representing the state when the machine is out of products.
 */
public class SoldOutState implements State {
    
    @Override
    public void handleRequest(Context context) {
        System.out.println("Machine is out of products. Please come back later.");
        
        // Check if we can refill the machine
        if (context.getCount() > 0) {
            context.setState(context.getNoCoinState());
        }
    }
    
    @Override
    public String toString() {
        return "Sold Out State";
    }
}
