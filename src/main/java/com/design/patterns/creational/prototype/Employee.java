package com.design.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete prototype class that implements the Prototype interface.
 */
public class Employee implements Prototype {
    private String name;
    private int id;
    private List<String> accessRights;
    
    /**
     * Constructor for creating a new employee.
     * @param name The name of the employee
     * @param id The ID of the employee
     * @param accessRights List of access rights for the employee
     */
    public Employee(String name, int id, List<String> accessRights) {
        this.name = name;
        this.id = id;
        this.accessRights = new ArrayList<>(accessRights);
    }
    
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        // Create a deep copy of the accessRights list
        List<String> tempAccessRights = new ArrayList<>(this.accessRights);
        return new Employee(this.name, this.id, tempAccessRights);
    }
    
    @Override
    public void customize(String name, int id) {
        this.name = name;
        this.id = id;
        // Keep the same access rights but can be modified if needed
    }
    
    @Override
    public void display() {
        System.out.println("Employee: " + name + ", ID: " + id);
        System.out.println("Access Rights: " + String.join(", ", accessRights));
    }
    
    /**
     * Adds an access right to the employee.
     * @param right The access right to add
     */
    public void addAccessRight(String right) {
        if (!accessRights.contains(right)) {
            accessRights.add(right);
        }
    }
    
    /**
     * Removes an access right from the employee.
     * @param right The access right to remove
     */
    public void removeAccessRight(String right) {
        accessRights.remove(right);
    }
    
    /**
     * Gets the list of access rights.
     * @return List of access rights
     */
    public List<String> getAccessRights() {
        return new ArrayList<>(accessRights);
    }
}
