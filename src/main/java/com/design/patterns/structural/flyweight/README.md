# Flyweight Pattern

The Flyweight pattern lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.

## When to Use
- When you need to support a large number of objects that have similar state
- When the storage costs are high because of the quantity of objects
- When most of the object state can be made extrinsic (external to the object)

## How to Run the Demo
1. Navigate to the project root directory
2. Compile the Java files:
   ```
   javac com/design/patterns/structural/flyweight/*.java
   ```
3. Run the demo class:
   ```
   java com.design.patterns.structural.flyweight.Demo
   ```
