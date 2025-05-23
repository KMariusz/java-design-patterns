# Adapter Pattern

The Adapter pattern allows objects with incompatible interfaces to collaborate by converting the interface of one class into another interface that clients expect.

## When to Use
- When you want to use an existing class, but its interface isn't compatible with the rest of your code
- When you want to create a reusable class that cooperates with classes that don't have compatible interfaces
- When you need to use several existing subclasses, but it's impractical to adapt their interface by subclassing every one
- When you need to provide a stable interface to similar components with different interfaces

## How to Run the Demo

### Using Maven (Recommended)
```bash
mvn compile exec:java -Padapter
```

### Using Java Directly
1. Navigate to the project root directory
2. Compile the Java files:
   ```bash
   javac com/design/patterns/structural/adapter/*.java
   ```
3. Run the demo class:
   ```bash
   java com.design.patterns.structural.adapter.AdapterPatternDemo
   ```

### Expected Output
```
Client: I can work just fine with the Target objects:
Target: The default target's behavior.

Client: The Adaptee class has a weird interface. See, I don't understand it:
Adaptee: .eetpadA eht fo roivaheb laicepS

Client: But I can work with it via the Adapter:
Adapter: (TRANSLATED) Special behavior of the Adaptee.
```

## Key Components
- **Target**: Defines the domain-specific interface that Client uses
- **Client**: Collaborates with objects conforming to the Target interface
- **Adaptee**: Defines an existing interface that needs adapting
- **Adapter**: Adapts the interface of Adaptee to the Target interface

## Real-world Analogy
Think of a power adapter that allows you to plug a device with a foreign plug into a different type of electrical outlet. The adapter sits between the device and the outlet, making them work together even though they weren't designed to.

## Related Patterns
- Bridge: Similar structure but different intent - separates an interface from its implementation
- Decorator: Enhances another object without changing its interface
- Proxy: Provides the same interface as its subject
