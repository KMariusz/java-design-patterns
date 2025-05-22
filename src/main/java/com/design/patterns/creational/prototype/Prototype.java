package com.design.patterns.creational.prototype;

/**
 * Prototype interface that declares the clone method.
 */
public interface Prototype extends Cloneable {
    /**
     * Creates a copy of the current object.
     * @return A clone of this instance
     */
    Prototype clone() throws CloneNotSupportedException;
    
    /**
     * Customizes the cloned object if needed.
     * @param name New name for the clone
     * @param id New ID for the clone
     */
    void customize(String name, int id);
    
    /**
     * Displays the prototype's details.
     */
    void display();
}
