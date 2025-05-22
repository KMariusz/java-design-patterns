package com.design.patterns.behavioral.visitor;

/**
 * Concrete implementation of ComputerPart for Keyboard.
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
