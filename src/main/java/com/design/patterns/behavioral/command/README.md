# Command Pattern

The Command pattern turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as method arguments, delay or queue a request's execution, and support undoable operations.

## When to Use
- When you want to parameterize objects with operations
- When you want to queue operations, schedule their execution, or execute them remotely
- When you need to implement reversible operations

## How to Run the Demo
1. Navigate to the project root directory
2. Compile the Java files:
   ```
   javac com/design/patterns/behavioral/command/*.java
   ```
3. Run the demo class:
   ```
   java com.design.patterns.behavioral.command.Demo
   ```
