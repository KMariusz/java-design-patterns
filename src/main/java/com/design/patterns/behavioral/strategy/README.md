# Strategy Pattern

The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

## When to Use
- When you want to use different variants of an algorithm within an object and be able to switch between them at runtime
- When you have many similar classes that only differ in the way they execute some behavior
- When you want to isolate the business logic of a class from the implementation details of algorithms

## How to Run the Demo
1. Navigate to the project root directory
2. Compile the Java files:
   ```
   javac com/design/patterns/behavioral/strategy/*.java
   ```
3. Run the demo class:
   ```
   java com.design.patterns.behavioral.strategy.Demo
   ```
