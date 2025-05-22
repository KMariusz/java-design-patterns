package com.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite class in the Composite pattern.
 * Represents a directory in the file system that can contain other files and directories.
 */
public class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children;
    
    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }
    
    @Override
    public void display(String indent) {
        System.out.println(indent + "+ " + name + " (" + getSize() + " bytes)");
        for (FileSystemComponent component : children) {
            component.display(indent + "  ");
        }
    }
    
    @Override
    public void add(FileSystemComponent component) {
        children.add(component);
    }
    
    @Override
    public void remove(FileSystemComponent component) {
        children.remove(component);
    }
    
    @Override
    public FileSystemComponent getChild(int i) {
        if (i >= 0 && i < children.size()) {
            return children.get(i);
        }
        return null;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public long getSize() {
        long totalSize = 0;
        for (FileSystemComponent component : children) {
            totalSize += component.getSize();
        }
        return totalSize;
    }
}
