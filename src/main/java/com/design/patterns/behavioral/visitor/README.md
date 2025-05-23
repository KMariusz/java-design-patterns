# Visitor Pattern

The Visitor pattern lets you separate algorithms from the objects on which they operate. It allows you to add new operations to existing object structures without modifying them.

## When to Use
- When you need to perform an operation on all elements of a complex object structure
- When you need to perform many distinct and unrelated operations on objects in an object structure
- When the classes defining the object structure rarely change, but you often want to define new operations over the structure

## How to Run the Demo
1. Navigate to the project root directory
2. Compile the Java files:
   ```
   javac com/design/patterns/behavioral/visitor/*.java
   ```
3. Run the demo class:
   ```
   java com.design.patterns.behavioral.visitor.Demo
   ```
