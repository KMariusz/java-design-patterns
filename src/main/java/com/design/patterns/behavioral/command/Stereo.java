package com.design.patterns.behavioral.command;

/**
 * The Stereo class represents a stereo system that can be controlled.
 */
public class Stereo {
    private String location;
    private int volume;
    private boolean isOn;
    
    /**
     * Constructor for Stereo.
     * @param location The location of the stereo (e.g., "Living Room")
     */
    public Stereo(String location) {
        this.location = location;
        this.volume = 5; // Default volume
        this.isOn = false;
    }
    
    /**
     * Turn the stereo on.
     */
    public void on() {
        isOn = true;
        System.out.println(location + " stereo is ON");
    }
    
    /**
     * Turn the stereo off.
     */
    public void off() {
        isOn = false;
        System.out.println(location + " stereo is OFF");
    }
    
    /**
     * Set the CD.
     */
    public void setCD() {
        System.out.println(location + " stereo is set for CD input");
    }
    
    /**
     * Set the DVD.
     */
    public void setDVD() {
        System.out.println(location + " stereo is set for DVD input");
    }
    
    /**
     * Set the radio.
     */
    public void setRadio() {
        System.out.println(location + " stereo is set for Radio");
    }
    
    /**
     * Set the volume.
     * @param level The volume level (0-11)
     */
    public void setVolume(int level) {
        if (level >= 0 && level <= 11) {
            this.volume = level;
            System.out.println(location + " stereo volume set to " + level);
        }
    }
    
    /**
     * Check if the stereo is on.
     * @return true if the stereo is on, false otherwise
     */
    public boolean isOn() {
        return isOn;
    }
    
    /**
     * Get the current volume.
     * @return The current volume level
     */
    public int getVolume() {
        return volume;
    }
}
