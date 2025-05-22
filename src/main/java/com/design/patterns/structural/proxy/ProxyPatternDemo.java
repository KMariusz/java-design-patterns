package com.design.patterns.structural.proxy;

import java.util.Scanner;

/**
 * Demo class for the Proxy pattern.
 * This example demonstrates how the Proxy pattern can be used
 * to control access to a resource (in this case, internet access).
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        // Create the proxy
        Internet internet = new ProxyInternet();
        
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        System.out.println("Internet Access Control");
        System.out.println("----------------------");
        
        while (running) {
            System.out.println("\nOptions:");
            System.out.println("1. Connect to a website");
            System.out.println("2. Ban a website");
            System.out.println("3. Unban a website");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            
            String choice = scanner.nextLine().trim();
            
            try {
                switch (choice) {
                    case "1":
                        System.out.print("Enter website to connect to: ");
                        String site = scanner.nextLine().trim();
                        try {
                            internet.connectTo(site);
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                        
                    case "2":
                        System.out.print("Enter website to ban: ");
                        String siteToBan = scanner.nextLine().trim();
                        ProxyInternet.banSite(siteToBan);
                        System.out.println("Banned " + siteToBan);
                        break;
                        
                    case "3":
                        System.out.print("Enter website to unban: ");
                        String siteToUnban = scanner.nextLine().trim();
                        ProxyInternet.unbanSite(siteToUnban);
                        System.out.println("Unbanned " + siteToUnban);
                        break;
                        
                    case "0":
                        running = false;
                        System.out.println("Goodbye!");
                        break;
                        
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
}
