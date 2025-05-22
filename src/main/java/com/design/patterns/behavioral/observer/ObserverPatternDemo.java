package com.design.patterns.behavioral.observer;

/**
 * Demo class for the Observer pattern.
 * This example demonstrates how the Observer pattern can be used to implement
 * a simple messaging system where observers are notified of state changes.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        // Create a subject
        ConcreteSubject subject = new ConcreteSubject();
        
        // Create observers
        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");
        ConcreteObserver observer3 = new ConcreteObserver("Observer 3");
        
        // Register observers to the subject
        observer1.setSubject(subject);
        observer2.setSubject(subject);
        observer3.setSubject(subject);
        
        // Now send a message to the subject
        System.out.println("First state change: Hello World!");
        subject.postMessage("Hello World!");
        
        // Unregister one observer
        subject.detach(observer2);
        
        // Send another message
        System.out.println("\nSecond state change: Hello Design Patterns!");
        subject.postMessage("Hello Design Patterns!");
        
        // Register observer2 again
        observer2.setSubject(subject);
        
        // Send another message
        System.out.println("\nThird state change: Observer 2 is back!");
        subject.postMessage("Observer 2 is back!");
    }
}
