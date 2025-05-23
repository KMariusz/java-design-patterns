# Prototype Pattern

The Prototype pattern lets you copy existing objects without making your code dependent on their classes.

## When to Use
- When your code shouldn't depend on the concrete classes of objects you need to copy
- When you want to reduce the number of subclasses that only differ in the way they initialize their objects
- When you need to create objects that are expensive to create and you want to cache them for performance

## How to Run the Demo
1. Navigate to the project root directory
2. Compile the Java files:
   ```
   javac com/design/patterns/creational/prototype/*.java
   ```
3. Run the demo class:
   ```
   java com.design.patterns.creational.prototype.Demo
   ```
