package com.design.patterns.behavioral.visitor;

/**
 * Visitor interface for the ComputerPart classes.
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
