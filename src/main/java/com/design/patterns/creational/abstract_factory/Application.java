package com.design.patterns.creational.abstract_factory;

/**
 * Client code that uses the abstract factory
 */
public class Application {
    private Button button;
    private Checkbox checkbox;
    
    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }
    
    public void render() {
        button.render();
        checkbox.render();
    }
    
    public void onClick() {
        button.onClick();
    }
    
    public void onCheck() {
        checkbox.onCheck();
        checkbox.render();
    }
}
