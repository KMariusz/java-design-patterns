package com.design.patterns.creational.abstract_factory;

/**
 * Concrete Factory: MacOS Factory
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }
    
    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
