package com.design.patterns.creational.abstract_factory;

/**
 * Abstract Factory: GUIFactory interface
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
