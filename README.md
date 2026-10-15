# Java Core Fundamentals

A practical learning repository covering Java programming fundamentals, object-oriented programming, exception handling, lambda expressions, collections, and data structures. The repository contains Java source files and Markdown notes for understanding the concepts through examples.

## Learning Objectives

- Understand Java syntax, data types, operators, and control flow.
- Learn how Java classes and objects work.
- Understand inheritance, abstraction, interfaces, and polymorphism.
- Work with user input and exception handling.
- Understand lambda expressions and functional interfaces.
- Learn Java Collections Framework interfaces and implementations.
- Understand JVM memory management and Java naming conventions.

## Project Structure

```text
java_core/
├── ArithmeticOperators.java
├── CollectionsAndDataStructures copy.java
├── ConditionalStatements.java
├── DataStructures.java
├── DataTypes.java
├── Inheritance.java
├── Input.java
├── Interfaces.java
├── LambdaExpressions.java
├── LogicalOperator.java
├── Loops.java
├── Oop.java
├── RelationalOperators.java
├── accessModifiers.md
├── datastructures.md
├── inheritance.md
├── memory_hundling.md
├── methodOverloadingAndOverriding.md
├── namingConventions.md
├── .gitignore
└── README.md
```

*Note: This structure represents the main files in the learning project. The actual contents may change as new examples are added. `MathOperations.java` is not currently listed because its source file needs to be verified.*

## Topics Covered

### 1. Java Fundamentals

- **Data types:** Primitive types and reference types.
- **Arithmetic operators:** Addition, subtraction, multiplication, division, and related operations.
- **Relational operators:** Comparing values using operators such as `==`, `!=`, `>`, and `<`.
- **Logical operators:** Combining conditions using `&&`, `||`, and `!`.
- **Conditional statements:** Making decisions using `if`, `else if`, `else`, and `switch`.
- **Loops:** Repeating instructions using `for`, `while`, and `do-while`.

### 2. Object-Oriented Programming

- Classes and objects.
- Constructors, fields, and methods.
- Inheritance using `extends`.
- Method overriding and method overloading.
- Access modifiers: `public`, `protected`, `private`, and package-private access.
- Abstract classes and interfaces.
- Implementing interfaces and using `@Override`.

### 3. User Input and Exception Handling

Learn how to accept input from the console and handle errors using Java exceptions.

Concepts include:

- Reading input with `Scanner`.
- Handling invalid input.
- Using `try`, `catch`, and `finally`.
- Throwing exceptions when input does not satisfy validation rules.

### 4. Lambda Expressions

Explore lambda expressions as a concise way to implement functional interfaces.

Example:

```java
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

public class LambdaExpressions {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a + b;

        System.out.println(calculator.add(10, 20));
    }
}
```

Expected output:

```text
30
```

### 5. Collections and Data Structures

The Java Collections Framework provides interfaces and implementations for storing and manipulating groups of objects.

Topics include:

- `List`: Ordered collections that allow duplicates.
- `ArrayList`: A resizable array implementation.
- `LinkedList`: A linked implementation of `List` and `Deque`.
- `Queue`: A collection designed for processing elements, commonly in FIFO order.
- `Deque`: A double-ended queue supporting operations at both ends.
- `Set`: A collection that does not allow duplicate elements.
- `HashSet`: A set without a guaranteed iteration order.
- `LinkedHashSet`: A set that preserves insertion order.
- `Map`: Stores key-value pairs, with unique keys.
- `HashMap` and `LinkedHashMap`: Common implementations of `Map`.

The collection interfaces and their implementations are explored through practical examples and supporting notes.

### 6. JVM Memory Management

The supporting notes introduce:

- Stack memory and method execution.
- Heap memory and objects.
- Primitive variables and object references.
- Garbage collection and object lifecycle basics.

### 7. Naming Conventions

The documentation covers standard Java naming conventions, including:

- `PascalCase` for classes and interfaces.
- `camelCase` for variables and methods.
- `UPPER_SNAKE_CASE` for constants.
- Descriptive names for packages, classes, methods, and variables.

## Prerequisites

Install a Java Development Kit (JDK). This project uses Java 25.

Verify your installation:

```bash
java -version
javac -version
```

Both commands should report a compatible Java installation.

## Running the Examples

Open a terminal and navigate to the project directory:

```bash
cd ~/Mbugua/Java/Learn/java_core
```

Compile a Java source file:

```bash
javac DataTypes.java
```

Run the compiled class:

```bash
java DataTypes
```

Java source files containing a `public` class should use a filename matching that class name.

### Running Examples with Multiple Source Files

If a class depends on another class, compile the required source files together. For example:

```bash
javac InputHandler.java Input.java
java Input
```

Use this command if your input example is organized into `InputHandler.java` and `Input.java`. Otherwise, compile the actual source files that exist in your project.

## Documentation

The Markdown notes provide additional explanations beyond the code examples.

| File | Subject |
|---|---|
| `accessModifiers.md` | Access modifiers and package access |
| `datastructures.md` | Java collections and data structures |
| `inheritance.md` | Inheritance concepts |
| `memory_hundling.md` | JVM memory management |
| `methodOverloadingAndOverriding.md` | Overloading and overriding |
| `namingConventions.md` | Java naming conventions |

## Git and Compiled Files

The repository uses Git to track source code and documentation. Compiled `.class` files are generated by `javac` and should generally not be committed.

The `.gitignore` file excludes them:

```gitignore
*.class
```

After adding new source files or notes, review the changes before committing:

```bash
git status
git add README.md
git commit -m "Add Java fundamentals project README"
```

## Learning Approach

Each topic is explored through source code, practical examples, and supporting notes. The goal is to build a solid understanding of Java fundamentals before progressing to more advanced topics such as generics, streams, concurrency, design patterns, and application development.

## License

This repository is intended for personal learning and educational use. Add a formal license if you plan to distribute the project publicly.
