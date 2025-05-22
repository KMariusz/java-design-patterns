package com.design.patterns.behavioral.visitor;

/**
 * Concrete implementation of ComputerPart for Monitor.
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
