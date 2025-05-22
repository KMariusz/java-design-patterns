package com.design.patterns.behavioral.command;

/**
 * The Command interface declares a method for executing a command.
 */
public interface Command {
    /**
     * Execute the command.
     */
    void execute();
    
    /**
     * Undo the command.
     */
    void undo();
}
