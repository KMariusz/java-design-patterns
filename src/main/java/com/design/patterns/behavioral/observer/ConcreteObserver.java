package com.design.patterns.behavioral.observer;

/**
 * Concrete Observer that reacts to updates from the Subject.
 */
public class ConcreteObserver implements Observer {
    private String name;
    private Subject topic;
    
    public ConcreteObserver(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String message) {
        if (message == null) {
            System.out.println(name + ":: No new message");
        } else {
            System.out.println(name + ":: Consuming message::" + message);
        }
    }
    
    /**
     * Subscribe to a subject to receive updates.
     * @param subject The subject to subscribe to.
     */
    public void setSubject(Subject subject) {
        if (this.topic != null) {
            this.topic.detach(this);
        }
        this.topic = subject;
        this.topic.attach(this);
    }
}
