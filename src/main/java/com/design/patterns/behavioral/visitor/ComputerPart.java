package com.design.patterns.behavioral.visitor;

/**
 * Interface for the elements in the Visitor pattern.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
