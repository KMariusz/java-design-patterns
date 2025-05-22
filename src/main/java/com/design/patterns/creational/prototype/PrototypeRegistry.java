package com.design.patterns.creational.prototype;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Prototype registry that stores and retrieves prototypes by key.
 */
public class PrototypeRegistry {
    private Map<String, Prototype> prototypes = new HashMap<>();
    
    /**
     * Adds a prototype to the registry.
     * @param key The key to identify the prototype
     * @param prototype The prototype to store
     */
    public void addPrototype(String key, Prototype prototype) {
        prototypes.put(key, prototype);
    }
    
    /**
     * Retrieves a prototype by key and returns a clone of it.
     * @param key The key of the prototype to retrieve
     * @return A clone of the prototype, or null if not found
     */
    public Prototype getPrototype(String key) {
        try {
            Prototype prototype = prototypes.get(key);
            return prototype != null ? prototype.clone() : null;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * Loads default prototypes into the registry.
     */
    public void loadDefaults() {
        // Create and add some default employee prototypes
        Employee developer = new Employee("Developer", 1000, List.of("read", "write", "debug"));
        Employee manager = new Employee("Manager", 2000, List.of("read", "write", "approve", "delegate"));
        Employee admin = new Employee("Admin", 3000, List.of("read", "write", "delete", "configure"));
        
        addPrototype("developer", developer);
        addPrototype("manager", manager);
        addPrototype("admin", admin);
    }
}
