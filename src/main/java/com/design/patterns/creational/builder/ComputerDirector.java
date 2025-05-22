package com.design.patterns.creational.builder;

/**
 * Director class that knows the building steps to create different computer configurations.
 * This class is optional but helps in creating pre-configured computers.
 */
public class ComputerDirector {
    
    /**
     * Builds a basic office computer configuration.
     * @param HDD The hard disk drive specification
     * @param RAM The RAM specification
     * @return A configured Computer object
     */
    public Computer buildBasicOfficeComputer(String HDD, String RAM) {
        return new Computer.ComputerBuilder(HDD, RAM)
                .setProcessor("Intel Core i3")
                .setOperatingSystem("Windows 10 Pro")
                .setGraphicsCardEnabled(false)
                .setBluetoothEnabled(true)
                .build();
    }
    
    /**
     * Builds a gaming computer configuration.
     * @param HDD The hard disk drive specification
     * @param RAM The RAM specification
     * @return A configured Computer object
     */
    public Computer buildGamingComputer(String HDD, String RAM) {
        return new Computer.ComputerBuilder(HDD, RAM)
                .setProcessor("Intel Core i9")
                .setOperatingSystem("Windows 11")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();
    }
    
    /**
     * Builds a developer computer configuration.
     * @param HDD The hard disk drive specification
     * @param RAM The RAM specification
     * @return A configured Computer object
     */
    public Computer buildDeveloperComputer(String HDD, String RAM) {
        return new Computer.ComputerBuilder(HDD, RAM)
                .setProcessor("AMD Ryzen 9")
                .setOperatingSystem("Ubuntu 22.04 LTS")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();
    }
}
