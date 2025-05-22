package com.design.patterns.behavioral.command;

/**
 * Concrete Command for turning a stereo on with CD.
 */
public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;
    private int previousVolume;
    
    /**
     * Constructor for StereoOnWithCDCommand.
     * @param stereo The stereo to control
     */
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    
    @Override
    public void execute() {
        // Save the previous volume for undo
        previousVolume = stereo.getVolume();
        
        stereo.on();
        stereo.setCD();
        stereo.setVolume(7); // Set a comfortable listening level
    }
    
    @Override
    public void undo() {
        // Restore the previous state
        if (stereo.isOn()) {
            stereo.setVolume(previousVolume);
            stereo.off();
        }
    }
}
