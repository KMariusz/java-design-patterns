package com.design.patterns.structural.facade;

/**
 * Subsystem class for the CD player.
 */
public class CdPlayer {
    private String description;
    private int currentTrack;
    private String title;
    
    public CdPlayer(String description, Amplifier amplifier) {
        this.description = description;
    }
    
    public void on() {
        System.out.println(description + " on");
    }
    
    public void off() {
        System.out.println(description + " off");
    }
    
    public void eject() {
        title = null;
        System.out.println(description + " eject");
    }
    
    public void play(String title) {
        this.title = title;
        currentTrack = 0;
        System.out.println(description + " playing \"" + title + "\"");
    }
    
    public void play(int track) {
        if (title == null) {
            System.out.println(description + " can't play track " + track + " no cd inserted");
        } else {
            currentTrack = track;
            System.out.println(description + " playing track " + currentTrack);
        }
    }
    
    public void stop() {
        currentTrack = 0;
        System.out.println(description + " stopped");
    }
    
    public void pause() {
        System.out.println(description + " paused \"" + title + "\"");
    }
    
    @Override
    public String toString() {
        return description;
    }
}
