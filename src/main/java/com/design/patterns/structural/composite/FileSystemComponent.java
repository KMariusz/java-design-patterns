package com.design.patterns.structural.composite;

/**
 * Component interface for the Composite pattern.
 */
public interface FileSystemComponent {
    void display(String indent);
    void add(FileSystemComponent component);
    void remove(FileSystemComponent component);
    FileSystemComponent getChild(int i);
    String getName();
    long getSize();
}
