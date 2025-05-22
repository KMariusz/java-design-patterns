package com.design.patterns.behavioral.state;

/**
 * The VendingMachine class is the context in the State pattern.
 * It maintains an instance of a State subclass that defines the current state.
 */
public class VendingMachine implements Context {
    private State noCoinState;
    private State hasCoinState;
    private State soldState;
    private State soldOutState;
    private State winnerState;
    
    private State state;
    private int count = 0;
    
    /**
     * Constructor for VendingMachine.
     * @param count The initial number of products in the machine
     */
    public VendingMachine(int count) {
        // Initialize all states
        noCoinState = new NoCoinState();
        hasCoinState = new HasCoinState();
        soldState = new SoldState();
        soldOutState = new SoldOutState();
        winnerState = new WinnerState();
        
        this.count = count;
        
        // Set initial state
        if (count > 0) {
            state = noCoinState;
        } else {
            state = soldOutState;
        }
    }
    
    @Override
    public void insertCoin() {
        state.handleRequest(this);
        if (state == noCoinState) {
            state = hasCoinState;
            System.out.println("Coin inserted");
        } else if (state == hasCoinState) {
            System.out.println("You can't insert another coin");
        } else if (state == soldOutState) {
            System.out.println("You can't insert a coin, the machine is sold out");
        } else if (state == soldState || state == winnerState) {
            System.out.println("Please wait, we're already giving you a product");
        }
    }
    
    @Override
    public void ejectCoin() {
        if (state == hasCoinState) {
            System.out.println("Coin returned");
            state = noCoinState;
        } else if (state == noCoinState) {
            System.out.println("You haven't inserted a coin");
        } else if (state == soldState || state == winnerState) {
            System.out.println("Sorry, you already pressed the button");
        } else if (state == soldOutState) {
            System.out.println("You can't eject, you haven't inserted a coin yet");
        }
    }
    
    @Override
    public void pressButton() {
        if (state == hasCoinState) {
            System.out.println("You pressed the button...");
            state.handleRequest(this);
        } else if (state == noCoinState) {
            System.out.println("You need to insert a coin first");
        } else if (state == soldState || state == winnerState) {
            System.out.println("Please wait, we're already giving you a product");
        } else if (state == soldOutState) {
            System.out.println("The machine is sold out");
        }
    }
    
    @Override
    public void dispense() {
        if (state == soldState || state == winnerState) {
            state.handleRequest(this);
        } else if (state == noCoinState) {
            System.out.println("You need to pay first");
        } else if (state == soldOutState) {
            System.out.println("No product dispensed");
        } else if (state == hasCoinState) {
            System.out.println("Please press the button");
        }
    }
    
    @Override
    public void refill(int count) {
        this.count += count;
        System.out.println("The machine was just refilled; its new count is: " + this.count);
        if (state == soldOutState && count > 0) {
            state = noCoinState;
        }
    }
    
    // Getters and setters for states
    @Override
    public State getState() {
        return state;
    }
    
    @Override
    public void setState(State state) {
        this.state = state;
    }
    
    @Override
    public State getNoCoinState() {
        return noCoinState;
    }
    
    @Override
    public State getHasCoinState() {
        return hasCoinState;
    }
    
    @Override
    public State getSoldState() {
        return soldState;
    }
    
    @Override
    public State getSoldOutState() {
        return soldOutState;
    }
    
    @Override
    public State getWinnerState() {
        return winnerState;
    }
    
    @Override
    public int getCount() {
        return count;
    }
    
    @Override
    public void setCount(int count) {
        this.count = count;
    }
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\nMighty Vending Machine");
        result.append("\nInventory: " + count + " product");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
