package com.design.patterns.behavioral.state;

/**
 * The Context defines the interface of interest to clients and maintains a reference
 * to an instance of a State subclass, which represents the current state of the Context.
 */
public interface Context {
    /**
     * Set the current state.
     * @param state The new state
     */
    void setState(State state);
    
    /**
     * Get the current state.
     * @return The current state
     */
    State getState();
    
    /**
     * Get the NoCoinState.
     * @return The NoCoinState
     */
    State getNoCoinState();
    
    /**
     * Get the HasCoinState.
     * @return The HasCoinState
     */
    State getHasCoinState();
    
    /**
     * Get the SoldState.
     * @return The SoldState
     */
    State getSoldState();
    
    /**
     * Get the SoldOutState.
     * @return The SoldOutState
     */
    State getSoldOutState();
    
    /**
     * Get the WinnerState.
     * @return The WinnerState
     */
    State getWinnerState();
    
    /**
     * Get the current product count.
     * @return The current product count
     */
    int getCount();
    
    /**
     * Set the product count.
     * @param count The new product count
     */
    void setCount(int count);
    
    /**
     * Insert a coin into the machine.
     */
    void insertCoin();
    
    /**
     * Eject the coin from the machine.
     */
    void ejectCoin();
    
    /**
     * Press the button to dispense a product.
     */
    void pressButton();
    
    /**
     * Dispense the product.
     */
    void dispense();
    
    /**
     * Refill the machine with products.
     * @param count The number of products to add
     */
    void refill(int count);
}
