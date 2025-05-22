package com.design.patterns.behavioral.observer;

/**
 * The Observer interface declares the update method, used by subjects.
 */
public interface Observer {
    /**
     * Receive update from subject.
     * @param message The message or data sent by the subject.
     */
    void update(String message);
}
