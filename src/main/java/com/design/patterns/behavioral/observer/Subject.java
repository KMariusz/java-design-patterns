package com.design.patterns.behavioral.observer;

/**
 * The Subject interface declares a set of methods for managing subscribers.
 */
public interface Subject {
    /**
     * Attach an observer to the subject.
     * @param observer The observer to attach.
     */
    void attach(Observer observer);
    
    /**
     * Detach an observer from the subject.
     * @param observer The observer to detach.
     */
    void detach(Observer observer);
    
    /**
     * Notify all observers about an event.
     */
    void notifyObservers();
}
