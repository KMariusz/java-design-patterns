# Java Design Patterns

This project contains practical implementations of common design patterns in Java. Each pattern is implemented with clear examples and detailed comments, following best practices and clean code principles. The project is organized into three main categories: Creational, Structural, and Behavioral patterns.

## 📋 Table of Contents
- [Project Structure](#project-structure)
- [Design Patterns Implemented](#design-patterns-implemented)
- [Getting Started](#getting-started)
- [How to Run](#how-to-run)
- [Pattern Descriptions](#pattern-descriptions)
- [Requirements](#requirements)
- [Contributing](#contributing)
- [License](#license)

## 🏗 Project Structure

```
src/main/java/com/design/patterns/
├── behavioral/
│   ├── chainofresponsibility/  # Chain of Responsibility Pattern
│   ├── command/                # Command Pattern
│   ├── observer/               # Observer Pattern
│   ├── state/                  # State Pattern
│   ├── strategy/               # Strategy Pattern
│   ├── template_method/        # Template Method Pattern
│   └── visitor/                # Visitor Pattern
├── creational/
│   ├── abstract_factory/      # Abstract Factory Pattern
│   ├── builder/                # Builder Pattern
│   ├── factory/                # Factory Method Pattern
│   ├── prototype/              # Prototype Pattern
│   └── singleton/              # Singleton Pattern
└── structural/
    ├── adapter/                 # Adapter Pattern
    ├── bridge/                   # Bridge Pattern
    ├── composite/               # Composite Pattern
    ├── decorator/               # Decorator Pattern
    ├── facade/                  # Facade Pattern
    ├── flyweight/               # Flyweight Pattern
    └── proxy/                   # Proxy Pattern
```

## Design Patterns Implemented

### Creational Patterns
- Factory Method
- Builder
- Singleton
- Prototype
- Abstract Factory

### Structural Patterns
- Adapter
- Bridge
- Composite
- Decorator
- Facade
- Flyweight
- Proxy

### Behavioral Patterns
- Chain of Responsibility
- Command
- Observer
- State
- Strategy
- Template Method
- Visitor

## 🚀 Getting Started

1. **Prerequisites**:
   - Java JDK 17 or higher
   - Maven 3.6.0 or higher

2. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/java-design-patterns.git
   cd java-design-patterns
   ```

3. **Build the project**:
   ```bash
   mvn clean install
   ```

## 🏃 How to Run

Each pattern implementation contains a demo class (e.g., `*Demo.java`) that demonstrates the pattern in action. You can run these demos using Maven with the following commands:

### 🎯 Running Demos

#### Behavioral Patterns
- **Chain of Responsibility Pattern**:
  ```bash
  mvn compile exec:java -Pchain_of_responsibility
  ```
- **Command Pattern**:
  ```bash
  mvn compile exec:java -Pcommand
  ```
- **Observer Pattern**:
  ```bash
  mvn compile exec:java -Pobserver
  ```
- **State Pattern**:
  ```bash
  mvn compile exec:java -Pstate
  ```
- **Strategy Pattern**:
  ```bash
  mvn compile exec:java -Pstrategy
  ```
- **Template Method Pattern**:
  ```bash
  mvn compile exec:java -Ptemplate_method
  ```
- **Visitor Pattern**:
  ```bash
  mvn compile exec:java -Pvisitor
  ```

#### Creational Patterns
- **Abstract Factory Pattern**:
  ```bash
  mvn compile exec:java -Pabstract_factory
  ```
- **Builder Pattern**:
  ```bash
  mvn compile exec:java -Pbuilder
  ```
- **Factory Method Pattern**:
  ```bash
  mvn compile exec:java -Pfactory
  ```
- **Prototype Pattern**:
  ```bash
  mvn compile exec:java -Pprototype
  ```
- **Singleton Pattern**:
  ```bash
  mvn compile exec:java -Psingleton
  ```

#### Structural Patterns
- **Adapter Pattern**:
  ```bash
  mvn compile exec:java -Padapter
  ```
- **Bridge Pattern**:
  ```bash
  mvn compile exec:java -Pbridge
  ```
- **Composite Pattern**:
  ```bash
  mvn compile exec:java -Pcomposite
  ```
- **Decorator Pattern**:
  ```bash
  mvn compile exec:java -Pdecorator
  ```
- **Facade Pattern**:
  ```bash
  mvn compile exec:java -Pfacade
  ```
- **Flyweight Pattern**:
  ```bash
  mvn compile exec:java -Pflyweight
  ```
- **Proxy Pattern**:
  ```bash
  mvn compile exec:java -Pproxy
  ```

## 📚 Pattern Descriptions

### 🧠 Behavioral Patterns
- **Chain of Responsibility**: Passes the request along a chain of handlers, where each handler can either process the request or pass it to the next handler in the chain.
- **Command**: Encapsulates a request as an object, allowing for parameterization of clients with different requests, queuing of requests, and logging of the requests.
- **Observer**: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
- **State**: Allows an object to alter its behavior when its internal state changes, appearing to change its class.
- **Strategy**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable, allowing the algorithm to vary independently from clients that use it.
- **Template Method**: Defines the skeleton of an algorithm in a method, deferring some steps to subclasses, allowing subclasses to redefine certain steps of an algorithm without changing the algorithm's structure.
- **Visitor**: Represents an operation to be performed on elements of an object structure, allowing you to define a new operation without changing the classes of the elements on which it operates.

### 🏗 Creational Patterns
- **Abstract Factory**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
- **Builder**: Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
- **Factory Method**: Defines an interface for creating an object but lets subclasses decide which class to instantiate, allowing a class to defer instantiation to subclasses.
- **Prototype**: Specifies the kinds of objects to create using a prototypical instance and creates new objects by copying this prototype.
- **Singleton**: Ensures a class has only one instance and provides a global point of access to it.

### 🏛️ Structural Patterns
- **Adapter**: Converts the interface of a class into another interface that clients expect, allowing classes to work together that couldn't otherwise because of incompatible interfaces.
- **Bridge**: Decouples an abstraction from its implementation so that the two can vary independently.
- **Composite**: Composes objects into tree structures to represent part-whole hierarchies, allowing clients to treat individual objects and compositions of objects uniformly.
- **Decorator**: Attaches additional responsibilities to an object dynamically, providing a flexible alternative to subclassing for extending functionality.
- **Facade**: Provides a unified interface to a set of interfaces in a subsystem, defining a higher-level interface that makes the subsystem easier to use.
- **Flyweight**: Minimizes memory usage or computational expenses by sharing as much as possible with similar objects.
- **Proxy**: Provides a surrogate or placeholder for another object to control access to it.

## 💻 Requirements
- Java JDK 17 or higher
- Maven 3.6.0 or higher (for building the project)

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a new branch for your feature or bugfix
3. Commit your changes with clear commit messages
4. Push to your fork and submit a pull request

Please ensure your code follows the project's coding standards and includes appropriate tests.

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
