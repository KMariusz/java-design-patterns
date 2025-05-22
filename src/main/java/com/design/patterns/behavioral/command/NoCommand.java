package com.design.patterns.behavioral.command;

/**
 * A command that does nothing. This is used to initialize command slots.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        // Do nothing
    }
    
    @Override
    public void undo() {
        // Do nothing
    }
}
