package com.design.patterns.creational.builder;

/**
 * The product class that will be built by the builder.
 * Represents a computer with various components.
 */
public class Computer {
    // Required parameters
    private final String HDD;
    private final String RAM;
    
    // Optional parameters - initialized to default values
    private final boolean isGraphicsCardEnabled;
    private final boolean isBluetoothEnabled;
    private final String processor;
    private final String operatingSystem;
    
    /**
     * Private constructor to force the use of the Builder
     */
    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.processor = builder.processor;
        this.operatingSystem = builder.operatingSystem;
    }
    
    // Getters for all fields
    public String getHDD() {
        return HDD;
    }
    
    public String getRAM() {
        return RAM;
    }
    
    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }
    
    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }
    
    public String getProcessor() {
        return processor;
    }
    
    public String getOperatingSystem() {
        return operatingSystem;
    }
    
    @Override
    public String toString() {
        return "Computer Configuration:\n" +
               "- HDD: " + HDD + "\n" +
               "- RAM: " + RAM + "\n" +
               "- Processor: " + processor + "\n" +
               "- Operating System: " + operatingSystem + "\n" +
               "- Graphics Card: " + (isGraphicsCardEnabled ? "Enabled" : "Disabled") + "\n" +
               "- Bluetooth: " + (isBluetoothEnabled ? "Enabled" : "Disabled");
    }
    
    /**
     * The Builder class for building Computer objects
     */
    public static class ComputerBuilder {
        // Required parameters
        private final String HDD;
        private final String RAM;
        
        // Optional parameters - initialized to default values
        private boolean isGraphicsCardEnabled = false;
        private boolean isBluetoothEnabled = false;
        private String processor = "Intel Core i5";
        private String operatingSystem = "Windows 10";
        
        /**
         * Constructor with required parameters
         * @param HDD The hard disk drive specification
         * @param RAM The RAM specification
         */
        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }
        
        // Methods to set optional parameters and return the builder for method chaining
        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }
        
        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }
        
        public ComputerBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }
        
        public ComputerBuilder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }
        
        /**
         * Build the Computer object
         * @return A new Computer instance with the configured parameters
         */
        public Computer build() {
            return new Computer(this);
        }
    }
}
