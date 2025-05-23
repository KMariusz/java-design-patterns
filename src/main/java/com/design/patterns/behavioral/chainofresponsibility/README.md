# Chain of Responsibility Pattern

The Chain of Responsibility pattern lets you pass requests along a chain of handlers. Each handler decides either to process the request or to pass it to the next handler in the chain.

## When to Use
- When you want to give more than one object a chance to handle a request
- When the exact handler for a request isn't known in advance
- When you want to decouple senders and receivers of requests

## How to Run the Demo

### Using Maven (Recommended)
```bash
mvn compile exec:java -Pchain_of_responsibility
```

### Using Java Directly
1. Navigate to the project root directory
2. Compile the Java files:
   ```bash
   javac com/design/patterns/behavioral/chainofresponsibility/*.java
   ```
3. Run the demo class:
   ```bash
   java com.design.patterns.behavioral.chainofresponsibility.ChainOfResponsibilityDemo
   ```

### Expected Output
```
Sending request to handler: ConcreteHandler1
ConcreteHandler1: Handling request 5
```

## Key Components
- **Handler**: Defines an interface for handling requests and (optionally) implements the successor link
- **ConcreteHandler**: Handles requests it is responsible for, can access its successor
- **Client**: Initiates the request to a ConcreteHandler object on the chain

## Real-world Analogy
Think of a technical support call center. The first-level support handles basic issues. If they can't resolve it, they escalate to the next level, and so on, until the issue reaches someone who can handle it.

## Related Patterns
- Command Pattern: Can be used to represent requests as objects
- Composite Pattern: The recursive composition used in the chain can be implemented using the Composite pattern
