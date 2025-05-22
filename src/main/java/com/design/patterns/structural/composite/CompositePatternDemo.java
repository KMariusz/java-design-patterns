package com.design.patterns.structural.composite;

/**
 * Demo class for the Composite pattern.
 * This example demonstrates how the Composite pattern can be used
 * to represent a file system with files and directories.
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        System.out.println("Composite Pattern Demo");
        System.out.println("----------------------");
        
        // Create files
        File file1 = new File("Document1.txt", 1024);
        File file2 = new File("Image1.jpg", 2048);
        File file3 = new File("Document2.pdf", 3072);
        File file4 = new File("Image2.png", 4096);
        File file5 = new File("Notes.txt", 512);
        
        // Create directories
        Directory documents = new Directory("Documents");
        Directory images = new Directory("Images");
        Directory root = new Directory("Root");
        
        // Build the directory structure
        documents.add(file1);
        documents.add(file3);
        documents.add(file5);
        
        images.add(file2);
        images.add(file4);
        
        root.add(documents);
        root.add(images);
        
        // Display the file system structure
        System.out.println("File System Structure:");
        root.display("");
        
        // Display sizes
        System.out.println("\nDirectory Sizes:");
        System.out.println("Documents: " + documents.getSize() + " bytes");
        System.out.println("Images: " + images.getSize() + " bytes");
        System.out.println("Root: " + root.getSize() + " bytes");
    }
}
