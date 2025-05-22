package com.design.patterns.behavioral.visitor;

/**
 * Concrete implementation of ComputerPart for Mouse.
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
