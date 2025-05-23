# Chain of Responsibility Pattern

The Chain of Responsibility pattern lets you pass requests along a chain of handlers. Each handler decides either to process the request or to pass it to the next handler in the chain.

## When to Use
- When you want to give more than one object a chance to handle a request
- When the exact handler for a request isn't known in advance
- When you want to decouple senders and receivers of requests

## How to Run the Demo
1. Navigate to the project root directory
2. Compile the Java files:
   ```
   javac com/design/patterns/behavioral/chainofresponsibility/*.java
   ```
3. Run the demo class:
   ```
   java com.design.patterns.behavioral.chainofresponsibility.Demo
   ```
