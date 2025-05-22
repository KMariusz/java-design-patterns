package com.design.patterns.behavioral.command;

/**
 * The RemoteControl class is the invoker that will execute commands.
 * It has multiple slots that can be programmed with commands.
 */
public class RemoteControl {
    private static final int NUM_SLOTS = 7;
    
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;
    
    /**
     * Constructor for RemoteControl.
     * Initializes all slots with NoCommand objects.
     */
    public RemoteControl() {
        onCommands = new Command[NUM_SLOTS];
        offCommands = new Command[NUM_SLOTS];
        
        Command noCommand = new NoCommand();
        for (int i = 0; i < NUM_SLOTS; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }
    
    /**
     * Set a command for a specific slot.
     * @param slot The slot number (0-based)
     * @param onCommand The command to execute when the on button is pressed
     * @param offCommand The command to execute when the off button is pressed
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (slot >= 0 && slot < NUM_SLOTS) {
            onCommands[slot] = onCommand;
            offCommands[slot] = offCommand;
        }
    }
    
    /**
     * Simulate the on button being pressed for a specific slot.
     * @param slot The slot number (0-based)
     */
    public void onButtonWasPushed(int slot) {
        if (slot >= 0 && slot < NUM_SLOTS) {
            onCommands[slot].execute();
            undoCommand = onCommands[slot];
        }
    }
    
    /**
     * Simulate the off button being pressed for a specific slot.
     * @param slot The slot number (0-based)
     */
    public void offButtonWasPushed(int slot) {
        if (slot >= 0 && slot < NUM_SLOTS) {
            offCommands[slot].execute();
            undoCommand = offCommands[slot];
        }
    }
    
    /**
     * Simulate the undo button being pressed.
     * This will undo the last command that was executed.
     */
    public void undoButtonWasPushed() {
        System.out.println("--- Undo button was pushed ---");
        undoCommand.undo();
    }
    
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control -------\n");
        for (int i = 0; i < NUM_SLOTS; i++) {
            stringBuilder.append("[slot " + i + "] " + 
                              onCommands[i].getClass().getSimpleName() + 
                              "    " + 
                              offCommands[i].getClass().getSimpleName() + "\n");
        }
        stringBuilder.append("[undo] " + undoCommand.getClass().getSimpleName() + "\n");
        return stringBuilder.toString();
    }
}
