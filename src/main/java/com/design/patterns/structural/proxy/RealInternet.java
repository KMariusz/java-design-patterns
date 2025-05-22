package com.design.patterns.structural.proxy;

/**
 * RealSubject class that implements the actual functionality.
 */
public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) {
        System.out.println("Connecting to " + serverHost);
    }
}
