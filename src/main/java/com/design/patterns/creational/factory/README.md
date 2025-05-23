# Factory Pattern

The Factory Method pattern provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

## When to Use
- When you don't know beforehand the exact types and dependencies of the objects your code should work with
- When you want to provide users of your library or framework with a way to extend its internal components
- When you want to save system resources by reusing existing objects instead of rebuilding them each time

## How to Run the Demo
1. Navigate to the project root directory
2. Compile the Java files:
   ```
   javac com/design/patterns/creational/factory/*.java
   ```
3. Run the demo class:
   ```
   java com.design.patterns.creational.factory.Demo
   ```
