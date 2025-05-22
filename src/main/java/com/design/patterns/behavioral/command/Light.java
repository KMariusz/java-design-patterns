package com.design.patterns.behavioral.command;

/**
 * The Receiver class contains the actual business logic to perform the operations.
 * In this example, it represents a light that can be turned on and off.
 */
public class Light {
    private boolean isOn = false;
    private String location;
    
    /**
     * Constructor for the Light class.
     * @param location The location of the light (e.g., "Living Room", "Kitchen")
     */
    public Light(String location) {
        this.location = location;
    }
    
    /**
     * Turn the light on.
     */
    public void on() {
        isOn = true;
        System.out.println(location + " light is ON");
    }
    
    /**
     * Turn the light off.
     */
    public void off() {
        isOn = false;
        System.out.println(location + " light is OFF");
    }
    
    /**
     * Check if the light is on.
     * @return true if the light is on, false otherwise
     */
    public boolean isOn() {
        return isOn;
    }
}
