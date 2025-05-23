# Observer Pattern

The Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

## When to Use
- When changes to one object require changing other objects, and you don't know how many objects need to be changed
- When an object should be able to notify other objects without making assumptions about who these objects are

## How to Run the Demo
1. Navigate to the project root directory
2. Compile the Java files:
   ```
   javac com/design/patterns/behavioral/observer/*.java
   ```
3. Run the demo class:
   ```
   java com.design.patterns.behavioral.observer.Demo
   ```
