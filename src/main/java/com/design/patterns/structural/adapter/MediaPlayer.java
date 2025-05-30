package com.design.patterns.structural.adapter;

/**
 * Target interface that the client expects to work with.
 */
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
