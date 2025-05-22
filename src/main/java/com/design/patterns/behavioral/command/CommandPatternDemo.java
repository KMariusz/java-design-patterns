package com.design.patterns.behavioral.command;

import java.util.Scanner;

/**
 * Demo class for the Command pattern.
 * This example demonstrates how the Command pattern can be used to
 * encapsulate method invocation, parameterize objects, and support undoable operations.
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        // Create the remote control (invoker)
        RemoteControl remoteControl = new RemoteControl();
        
        // Create the receivers
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo livingRoomStereo = new Stereo("Living Room");
        
        // Create the commands
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(livingRoomStereo);
        
        // Load the commands into the remote slots
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOnWithCD, new Command() {
            @Override
            public void execute() {
                livingRoomStereo.off();
            }
            
            @Override
            public void undo() {
                livingRoomStereo.on();
                livingRoomStereo.setCD();
                livingRoomStereo.setVolume(7);
            }
        });
        
        // Print the remote control
        System.out.println(remoteControl);
        
        // Create a simple CLI to interact with the remote control
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        System.out.println("Remote Control Simulator");
        System.out.println("Available commands:");
        System.out.println("  on <slot>   - Press the on button for the given slot");
        System.out.println("  off <slot>  - Press the off button for the given slot");
        System.out.println("  undo        - Undo the last command");
        System.out.println("  help        - Show this help message");
        System.out.println("  exit        - Exit the program");
        
        while (running) {
            System.out.print("\nEnter command: ");
            String[] input = scanner.nextLine().trim().split(" ");
            String command = input[0].toLowerCase();
            
            try {
                switch (command) {
                    case "on":
                        if (input.length < 2) {
                            System.out.println("Please specify a slot number.");
                            break;
                        }
                        int onSlot = Integer.parseInt(input[1]);
                        remoteControl.onButtonWasPushed(onSlot);
                        break;
                        
                    case "off":
                        if (input.length < 2) {
                            System.out.println("Please specify a slot number.");
                            break;
                        }
                        int offSlot = Integer.parseInt(input[1]);
                        remoteControl.offButtonWasPushed(offSlot);
                        break;
                        
                    case "undo":
                        remoteControl.undoButtonWasPushed();
                        break;
                        
                    case "help":
                        System.out.println("Available commands:");
                        System.out.println("  on <slot>   - Press the on button for the given slot");
                        System.out.println("  off <slot>  - Press the off button for the given slot");
                        System.out.println("  undo        - Undo the last command");
                        System.out.println("  help        - Show this help message");
                        System.out.println("  exit        - Exit the program");
                        break;
                        
                    case "exit":
                        running = false;
                        break;
                        
                    default:
                        System.out.println("Unknown command. Type 'help' for a list of commands.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid slot number. Please enter a valid number.");
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
        
        System.out.println("Goodbye!");
        scanner.close();
    }
}
