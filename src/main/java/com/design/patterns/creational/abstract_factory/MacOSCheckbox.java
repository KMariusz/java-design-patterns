package com.design.patterns.creational.abstract_factory;

/**
 * Concrete Product: MacOS Checkbox
 */
public class MacOSCheckbox implements Checkbox {
    private boolean checked;
    
    @Override
    public void render() {
        System.out.println("Rendering a macOS style checkbox. " + 
                         (checked ? "✓" : " "));
    }
    
    @Override
    public void onCheck() {
        checked = !checked;
        System.out.println("macOS checkbox " + (checked ? "checked" : "unchecked"));
    }
}
