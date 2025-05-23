# Abstract Factory Pattern

The Abstract Factory pattern lets you produce families of related objects without specifying their concrete classes.

## When to Use
- When your code needs to work with various families of related products, but you don't want it to depend on the concrete classes of those products
- When you want to provide a class library of products, and you want to reveal just their interfaces, not their implementations
- When you need to enforce that a family of products must be used together

## How to Run the Demo

### Using Maven (Recommended)
```bash
mvn compile exec:java -Pabstract_factory
```

### Using Java Directly
1. Navigate to the project root directory
2. Compile the Java files:
   ```bash
   javac com/design/patterns/creational/abstract_factory/*.java
   ```
3. Run the demo class:
   ```bash
   java com.design.patterns.creational.abstract_factory.AbstractFactoryDemo
   ```

### Expected Output
```
Creating Windows Button and Checkbox
Rendering a Windows button
Painting a Windows checkbox

Creating MacOS Button and Checkbox
Rendering a MacOS button
Painting a MacOS checkbox
```

## Key Components
- **AbstractFactory**: Declares an interface for operations that create abstract product objects
- **ConcreteFactory**: Implements the operations to create concrete product objects
- **AbstractProduct**: Declares an interface for a type of product object
- **ConcreteProduct**: Implements the AbstractProduct interface
- **Client**: Uses only interfaces declared by AbstractFactory and AbstractProduct classes

## Real-world Analogy
Think of a furniture store that offers different styles of furniture (Modern, Victorian, ArtDeco). Each style has matching furniture (chair, sofa, coffee table). The Abstract Factory would be the store that provides a way to get a complete set of matching furniture.

## Related Patterns
- Factory Method: Abstract Factory is often implemented with Factory Methods
- Singleton: Concrete factories are often singletons
- Prototype: Can be used to create and return product objects
