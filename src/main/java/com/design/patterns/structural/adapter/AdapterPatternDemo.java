package com.design.patterns.structural.adapter;

import java.util.Scanner;

/**
 * Demo class for the Adapter pattern.
 * This example demonstrates how the Adapter pattern can be used
 * to make incompatible interfaces work together.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Adapter Pattern Demo");
        System.out.println("--------------------");
        System.out.println("Supported formats: mp3, vlc, mp4");
        
        while (true) {
            System.out.println("\nEnter media type and file name (or 'exit' to quit):");
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }
            
            String[] parts = input.split(" ", 2);
            if (parts.length < 2) {
                System.out.println("Please specify both media type and file name.");
                continue;
            }
            
            String audioType = parts[0];
            String fileName = parts[1];
            
            audioPlayer.play(audioType, fileName);
        }
        
        scanner.close();
    }
}
