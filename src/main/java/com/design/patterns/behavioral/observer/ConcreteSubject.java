package com.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Subject that maintains a list of observers and notifies them of state changes.
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String message;
    private boolean changed = false;
    
    @Override
    public void attach(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("Observer is null");
        }
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }
    
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    
    @Override
    public void notifyObservers() {
        if (!changed) {
            return;
        }
        
        // Create a copy of the observers list to avoid concurrent modification
        List<Observer> observersLocal = new ArrayList<>(this.observers);
        
        // Notify all observers
        for (Observer observer : observersLocal) {
            observer.update(message);
        }
        
        // Reset the changed flag
        changed = false;
    }
    
    /**
     * Method to post a message to the topic.
     * @param message The message to be posted.
     */
    public void postMessage(String message) {
        System.out.println("Message posted to Topic: " + message);
        this.message = message;
        this.changed = true;
        notifyObservers();
    }
}
