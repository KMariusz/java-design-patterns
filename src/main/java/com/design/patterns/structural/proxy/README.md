# Proxy Pattern

The Proxy pattern provides a surrogate or placeholder for another object to control access to it.

## When to Use
- When you want to control access to an object (lazy initialization, access control, logging, etc.)
- When you need to add a layer of indirection to an object that is expensive to create or access
- When you want to add functionality to an object without changing its interface

## Common Types of Proxies
- Virtual Proxy: Creates expensive objects on demand
- Protection Proxy: Controls access to the original object
- Remote Proxy: Provides a local representative for an object in a different address space
- Smart Reference: Performs additional actions when an object is accessed

## How to Run the Demo
1. Navigate to the project root directory
2. Compile the Java files:
   ```
   javac com/design/patterns/structural/proxy/*.java
   ```
3. Run the demo class:
   ```
   java com.design.patterns.structural.proxy.Demo
   ```
