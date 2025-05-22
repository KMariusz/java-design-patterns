package com.design.patterns.behavioral.command;

/**
 * Concrete Command for turning a light on.
 */
public class LightOnCommand implements Command {
    private Light light;
    
    /**
     * Constructor for LightOnCommand.
     * @param light The light to control
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.on();
    }
    
    @Override
    public void undo() {
        light.off();
    }
}
