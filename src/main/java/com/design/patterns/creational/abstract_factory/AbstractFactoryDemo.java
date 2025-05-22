package com.design.patterns.creational.abstract_factory;

import java.util.Scanner;

/**
 * Demo class for the Abstract Factory pattern.
 * This example demonstrates how the Abstract Factory pattern can be used
 * to create families of related objects (UI components) for different
 * operating systems (Windows and macOS).
 */
public class AbstractFactoryDemo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        
        System.out.println("Select OS (1 - Windows, 2 - MacOS): ");
        try (Scanner scanner = new Scanner(System.in)) {
            String os = scanner.nextLine().trim();
            
            if (os.equals("1")) {
                factory = new WindowsFactory();
            } else {
                factory = new MacOSFactory();
            }
            
            app = new Application(factory);
            return app;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Abstract Factory Pattern Demo");
        System.out.println("----------------------------");
        
        Application app = configureApplication();
        
        System.out.println("\n--- Rendering UI Components ---");
        app.render();
        
        System.out.println("\n--- Interacting with Components ---");
        app.onClick();
        app.onCheck();
        
        System.out.println("\n--- Demo Complete ---");
    }
}
