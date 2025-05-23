# Singleton Pattern

The Singleton pattern ensures that a class has only one instance and provides a global point of access to it.

## When to Use
- When a class should have just a single instance available to all clients
- When you need stricter control over global variables
- When you want to ensure that a class has a single point of access

## How to Run the Demo
1. Navigate to the project root directory
2. Compile the Java files:
   ```
   javac com/design/patterns/creational/singleton/*.java
   ```
3. Run the demo class:
   ```
   java com.design.patterns.creational.singleton.Demo
   ```

## Implementation Notes
This directory contains different implementations of the Singleton pattern, including:
- Eager initialization
- Lazy initialization
- Thread-safe implementations
- Enum-based singleton
