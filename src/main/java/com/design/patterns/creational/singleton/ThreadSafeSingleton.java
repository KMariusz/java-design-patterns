package com.design.patterns.creational.singleton;

/**
 * Thread-safe Singleton implementation in Java using double-checked locking.
 * This approach ensures that only one instance of the class is created
 * even in a multithreaded environment.
 */
public class ThreadSafeSingleton {
    // volatile ensures that multiple threads handle the instance variable correctly
    private static volatile ThreadSafeSingleton instance;
    
    // private constructor to prevent instantiation from outside
    private ThreadSafeSingleton() {
        // Prevent instantiation via reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }
    
    /**
     * Returns the singleton instance of this class.
     * @return The singleton instance
     */
    public static ThreadSafeSingleton getInstance() {
        // Double-checked locking pattern
        ThreadSafeSingleton result = instance;
        if (result == null) {
            synchronized (ThreadSafeSingleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new ThreadSafeSingleton();
                }
            }
        }
        return result;
    }
    
    /**
     * Prevents cloning of the singleton instance.
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of singleton instance is not supported.");
    }
    
    /**
     * Prevents deserialization of the singleton instance.
     */
    protected Object readResolve() {
        return getInstance();
    }
    
    // Example method
    public void showMessage() {
        System.out.println("Hello from ThreadSafeSingleton!");
    }
    
    /**
     * Main method to demonstrate the Singleton pattern.
     */
    public static void main(String[] args) {
        // Get the singleton instance
        ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
        
        // Call a method on the singleton
        singleton.showMessage();
        
        // Verify that only one instance exists
        ThreadSafeSingleton anotherSingleton = ThreadSafeSingleton.getInstance();
        
        // Check if both references point to the same object
        if (singleton == anotherSingleton) {
            System.out.println("Both variables contain the same instance.");
        } else {
            System.out.println("Variables contain different instances.");
        }
    }
}
