package com.design.patterns.structural.adapter;

/**
 * Concrete implementation of AdvancedMediaPlayer for VLC format.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }
    
    @Override
    public void playMp4(String fileName) {
        // Do nothing - VLC player doesn't support MP4
    }
}
