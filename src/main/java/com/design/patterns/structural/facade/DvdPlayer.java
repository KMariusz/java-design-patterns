package com.design.patterns.structural.facade;

/**
 * Subsystem class for the DVD player.
 */
public class DvdPlayer {
    private String description;
    private int currentTrack;
    private String movie;
    
    public DvdPlayer(String description, Amplifier amplifier) {
        this.description = description;
    }
    
    public void on() {
        System.out.println(description + " on");
    }
    
    public void off() {
        System.out.println(description + " off");
    }
    
    public void eject() {
        movie = null;
        System.out.println(description + " eject");
    }
    
    public void play(String movie) {
        this.movie = movie;
        currentTrack = 0;
        System.out.println(description + " playing \"" + movie + "\"");
    }
    
    public void play(int track) {
        if (movie == null) {
            System.out.println(description + " can't play track " + track + " no dvd inserted");
        } else {
            currentTrack = track;
            System.out.println(description + " playing track " + currentTrack + " of \"" + movie + "\"");
        }
    }
    
    public void stop() {
        currentTrack = 0;
        System.out.println(description + " stopped \"" + movie + "\"");
    }
    
    public void pause() {
        System.out.println(description + " paused \"" + movie + "\"");
    }
    
    public void setTwoChannelAudio() {
        System.out.println(description + " set two channel audio");
    }
    
    public void setSurroundAudio() {
        System.out.println(description + " set surround audio");
    }
    
    @Override
    public String toString() {
        return description;
    }
}
