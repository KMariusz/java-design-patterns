package com.design.patterns.creational.abstract_factory;

/**
 * Concrete Product: Windows Checkbox
 */
public class WindowsCheckbox implements Checkbox {
    private boolean checked;
    
    @Override
    public void render() {
        System.out.println("Rendering a Windows style checkbox. " + 
                         (checked ? "[X]" : "[ ]"));
    }
    
    @Override
    public void onCheck() {
        checked = !checked;
        System.out.println("Windows checkbox " + (checked ? "checked" : "unchecked"));
    }
}
