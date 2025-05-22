package com.design.patterns.behavioral.command;

/**
 * Concrete Command for turning a light off.
 */
public class LightOffCommand implements Command {
    private Light light;
    private boolean wasOn; // To keep track of the previous state for undo
    
    /**
     * Constructor for LightOffCommand.
     * @param light The light to control
     */
    public LightOffCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        wasOn = light.isOn();
        light.off();
    }
    
    @Override
    public void undo() {
        if (wasOn) {
            light.on();
        } else {
            light.off();
        }
    }
}
