# Object-Oriented Programming and Memory Management in Java

## Memory Management in Java

Memory management in Java is handled primarily by the JVM (Java Virtual Machine) and the Garbage Collector.

A simplified model of JVM memory is:

- **Stack memory**: Used for method execution. Each thread has its own stack. Stack frames are created when methods are called and removed when the methods finish. Local variables and method parameters are commonly represented in these frames.
- **Heap memory**: Used primarily for dynamically allocated objects and arrays. Objects created with `new` are typically allocated on the heap. The Garbage Collector manages objects that are no longer reachable.
- **Important**: The stack and heap model is a simplified way of understanding Java memory. The JVM and JIT compiler can optimize how values are actually represented and stored.

## 1. Stack Memory

When a method is called, the JVM creates a stack frame for that method.

For example:

```java
public int add(int a, int b) {
    return a + b;
}
```

When we call:

```java
math.add(10, 20);
```

the method receives:

```text
a = 10
b = 20
```

Conceptually, the stack contains a frame for the `add()` method:

```text
Stack

add()
----------------
a = 10
b = 20
----------------
```

When `add()` finishes, its stack frame is removed.

This means method-local execution data has a lifetime associated with the method call.

## 2. Heap Memory

The heap is primarily where Java dynamically allocates objects and arrays.

When we write:

```java
MathOperations math = new MathOperations();
```

the `new MathOperations()` part creates a `MathOperations` object.

Conceptually:

```text
Stack                         Heap

math ──────────────────────► MathOperations object
```

The variable `math` is a reference that allows the program to access the object.

## 3. Object Lifetime and Garbage Collection

Consider:

```java
MathOperations math = new MathOperations();
```

As long as the object is reachable through a reference such as:

```text
math ─────────► MathOperations object
```

the object is considered reachable.

When the method finishes and there are no remaining references to the object:

```text
MathOperations object

        ▲
        │
     nobody
```

the object becomes **eligible for garbage collection**.

The Garbage Collector can eventually reclaim the memory occupied by that object.

Important:

> Becoming eligible for garbage collection does not mean the object is immediately deleted. The JVM decides when garbage collection occurs.

## 4. Stack and Heap Together

Consider:

```java
MathOperations math = new MathOperations();
int sum = math.add(10, 20);
```

A simplified representation is:

```text
                  JVM

        STACK                  HEAP

   main() frame
   ┌───────────────┐
   │ math ─────────┼────────► MathOperations object
   │ sum = 30      │
   └───────────────┘
```

When `add()` is called, another stack frame is temporarily created:

```text
   STACK

   add() frame
   ┌───────────────┐
   │ a = 10        │
   │ b = 20        │
   └───────────────┘

   main() frame
   ┌───────────────┐
   │ math ─────────┼────────► MathOperations object
   │ sum           │
   └───────────────┘
```

After `add()` returns `30`, the `add()` stack frame is removed.

## 5. Instance Variables

An instance variable is a variable that belongs to an object.

For example:

```java
class MathOperations {

    int multiplier = 2;

}
```

When we create:

```java
MathOperations math = new MathOperations();
```

the object has its own `multiplier` state.

Conceptually:

```text
Stack                         Heap

math ──────────────────────► MathOperations object
                             ┌──────────────────┐
                             │ multiplier = 2   │
                             └──────────────────┘
```

## 6. Method Parameters

In this method:

```java
public int add(int a, int b) {
    return a + b;
}
```

`a` and `b` are **method parameters**, not instance variables.

They exist as part of the method's execution context.

When:

```java
math.add(10, 20);
```

is called:

```text
a = 10
b = 20
```

The method calculates:

```text
10 + 20 = 30
```

and returns `30`.

Once the method finishes, its stack frame is no longer needed.

## 7. Our MathOperations Class

Our class contains methods for performing mathematical operations:

```java
class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {

        if (b == 0) {
            System.out.println("Division by " + b + " is not allowed");
            return 0;
        }

        return (double) a / b;
    }
}
```

## 8. Creating an Object

Inside `main()`:

```java
MathOperations math = new MathOperations();
```

This creates an instance of the `MathOperations` class.

We can then use the object:

```java
math.add(10, 20);
math.subtract(20, 10);
math.multiply(10, 20);
math.divide(20, 10);
```

The reference `math` gives us access to the object's methods.

## Complete Program

```java
class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {

        if (b == 0) {
            System.out.println("Division by " + b + " is not allowed");
            return 0;
        }

        return (double) a / b;
    }
}

public class Oop {

    public static void main(String[] args) {

        System.out.println("Object Oriented Programming in Java");

        // Creating an object of MathOperations
        MathOperations math = new MathOperations();

        // Addition
        int sum = math.add(10, 20);
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = math.subtract(20, 10);
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = math.multiply(10, 20);
        System.out.println("Product: " + product);

        // Division
        double quotient = math.divide(20, 10);
        System.out.println("Quotient: " + quotient);
    }
}
```

## The Key Mental Model

Remember this simplified model:

```text
MathOperations math = new MathOperations();
        │                    │
        │                    └── Creates an object
        │                        primarily on the heap
        │
        └── Reference to the object


Method call:

math.add(10, 20);

        │
        ▼

   add() stack frame
   ┌───────────────┐
   │ a = 10        │
   │ b = 20        │
   └───────────────┘
        │
        ▼
      30
        │
        ▼
 stack frame removed
```

The most important concepts to remember at this stage are:

1. **A class is a blueprint/type.**
2. **An object is an instance created from a class.**
3. **`new` creates an object.**
4. **A reference allows us to access an object.**
5. **Methods execute using stack frames.**
6. **Objects are primarily managed in heap memory.**
7. **The Garbage Collector reclaims objects that are no longer reachable.**
8. **Method parameters and local variables belong to a method's execution context.**
9. **Instance variables belong to objects.**
10. **The stack/heap explanation is a simplified model; the JVM can optimize the actual representation.**
