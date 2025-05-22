package com.design.patterns.creational.factory;

/**
 * The Creator class declares the factory method that returns new product objects.
 * The Creator's subclasses usually provide the implementation of this method.
 */
public abstract class Creator {
    /**
     * Factory method that creates a product.
     * @return A Product instance
     */
    public abstract Product createProduct();
    
    /**
     * An operation that uses the product.
     * @return A string representing the result of the operation
     */
    public String someOperation() {
        // Call the factory method to create a Product object
        Product product = createProduct();
        // Now, use the product
        return "Creator: The same creator's code has just worked with " + product.getDescription();
    }
}
