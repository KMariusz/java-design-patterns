package com.design.patterns.behavioral.template_method;

/**
 * Abstract class defining the template method and primitive operations.
 */
public abstract class Game {
    // Template method
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
    
    // Primitive operations to be implemented by subclasses
    protected abstract void initialize();
    protected abstract void startPlay();
    protected abstract void endPlay();
}
