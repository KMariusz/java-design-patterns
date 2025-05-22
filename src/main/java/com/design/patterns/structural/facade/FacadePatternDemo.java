package com.design.patterns.structural.facade;

import java.util.Scanner;

/**
 * Demo class for the Facade pattern.
 * This example demonstrates how the Facade pattern can be used
 * to simplify the interface to a complex home theater system.
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        // Create the components of the home theater
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");
        
        // Create the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
            amp, tuner, dvd, cd, projector, screen, lights, popper
        );
        
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        System.out.println("Home Theater Control");
        System.out.println("--------------------");
        
        while (running) {
            System.out.println("\nOptions:");
            System.out.println("1. Watch a movie");
            System.out.println("2. End the movie");
            System.out.println("3. Listen to a CD");
            System.out.println("4. Stop the CD");
            System.out.println("5. Listen to the radio");
            System.out.println("6. Turn off the radio");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            
            String choice = scanner.nextLine().trim();
            
            try {
                switch (choice) {
                    case "1":
                        System.out.print("Enter movie title: ");
                        String movie = scanner.nextLine().trim();
                        homeTheater.watchMovie(movie);
                        break;
                        
                    case "2":
                        homeTheater.endMovie();
                        break;
                        
                    case "3":
                        System.out.print("Enter CD title: ");
                        String cdTitle = scanner.nextLine().trim();
                        System.out.print("Enter track number: ");
                        int track = Integer.parseInt(scanner.nextLine().trim());
                        homeTheater.listenToCd(cdTitle, track);
                        break;
                        
                    case "4":
                        homeTheater.endCd();
                        break;
                        
                    case "5":
                        System.out.print("Enter frequency (e.g., 98.5): ");
                        double frequency = Double.parseDouble(scanner.nextLine().trim());
                        homeTheater.listenToRadio(frequency);
                        break;
                        
                    case "6":
                        homeTheater.endRadio();
                        break;
                        
                    case "0":
                        running = false;
                        System.out.println("Goodbye!");
                        break;
                        
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
}
