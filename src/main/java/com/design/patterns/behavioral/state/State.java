package com.design.patterns.behavioral.state;

/**
 * The State interface declares the state-specific methods that all concrete states must implement.
 * These methods represent actions that can be performed on the context.
 */
public interface State {
    /**
     * Handle the request for this state.
     * @param context The context whose state is being handled
     */
    void handleRequest(Context context);
    
    /**
     * @return A string representation of the state
     */
    String toString();
}
