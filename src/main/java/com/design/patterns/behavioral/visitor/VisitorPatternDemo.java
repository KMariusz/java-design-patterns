package com.design.patterns.behavioral.visitor;

/**
 * Demo class for the Visitor pattern.
 * This example demonstrates how the Visitor pattern can be used
 * to separate an algorithm from the object structure on which it operates.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        System.out.println("Visitor Pattern Demo");
        System.out.println("-------------------");
        
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
