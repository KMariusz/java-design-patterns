package com.design.patterns.structural.adapter;

/**
 * Adaptee interface with a different interface than what the client expects.
 */
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
