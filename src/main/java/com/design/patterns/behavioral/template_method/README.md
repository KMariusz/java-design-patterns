# Template Method Pattern

The Template Method pattern defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

## When to Use
- When you want to let clients extend only particular steps of an algorithm, but not the whole algorithm or its structure
- When you have several classes that contain almost identical algorithms with some minor differences

## How to Run the Demo
1. Navigate to the project root directory
2. Compile the Java files:
   ```
   javac com/design/patterns/behavioral/template_method/*.java
   ```
3. Run the demo class:
   ```
   java com.design.patterns.behavioral.template_method.Demo
   ```
