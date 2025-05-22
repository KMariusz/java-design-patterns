package com.design.patterns.structural.composite;

/**
 * Leaf class in the Composite pattern.
 * Represents a file in the file system.
 */
public class File implements FileSystemComponent {
    private String name;
    private long size;
    
    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }
    
    @Override
    public void display(String indent) {
        System.out.println(indent + "- " + name + " (" + size + " bytes)");
    }
    
    @Override
    public void add(FileSystemComponent component) {
        // Files cannot have children
        throw new UnsupportedOperationException("Cannot add to a file");
    }
    
    @Override
    public void remove(FileSystemComponent component) {
        // Files cannot have children
        throw new UnsupportedOperationException("Cannot remove from a file");
    }
    
    @Override
    public FileSystemComponent getChild(int i) {
        // Files don't have children
        return null;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public long getSize() {
        return size;
    }
}
