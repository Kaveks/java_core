# Java Method Overloading and Overriding

Java supports two important forms of polymorphism:

1. Method Overloading
2. Method Overriding

Although both use the word "method", they solve different problems.

---

# 1. Method Overloading

Method overloading means having **multiple methods with the same name but different parameters** in the same class.

For example:

```java
class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
```

All three methods are called:

```java
add()
```

But their parameters are different.

```text
add(int, int)
add(int, int, int)
add(double, double)
```

Java determines which method to call based on the arguments.

---

## Calling the overloaded methods

```java
Calculator calculator = new Calculator();

System.out.println(calculator.add(10, 20));

System.out.println(calculator.add(10, 20, 30));

System.out.println(calculator.add(10.5, 20.5));
```

Output:

```text
30
60
31.0
```

The method name remains the same:

```java
add()
```

but the parameter list changes.

---

# 2. What Can Change During Overloading?

The parameters must differ.

They can differ by:

### Number of parameters

```java
add(int a, int b)

add(int a, int b, int c)
```

### Type of parameters

```java
add(int a, int b)

add(double a, double b)
```

### Order of parameter types

```java
process(String name, int age)

process(int age, String name)
```

These are also different methods.

---

# 3. Return Type Alone Is Not Enough

This is **not valid overloading**:

```java
public int add(int a, int b) {
    return a + b;
}

public double add(int a, int b) {
    return a + b;
}
```

The parameter list is identical:

```text
(int, int)
```

Changing only the return type does not create a different method.

The compiler cannot determine which method you mean based only on the return type.

---

# 4. Method Overriding

Method overriding happens when a **child class provides its own implementation of a method inherited from the parent class**.

Example:

```java
class Animal {

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
```

`Animal` has:

```java
makeSound()
```

`Dog` inherits that method but provides its own implementation.

Therefore:

```java
Dog dog = new Dog();

dog.makeSound();
```

produces:

```text
Dog barks
```

---

# 5. The `@Override` Annotation

You will normally see:

```java
@Override
```

above an overriding method.

```java
class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
```

`@Override` tells the compiler:

> I intend for this method to override a method from the parent class.

This is useful because the compiler can detect mistakes.

For example, if you accidentally write:

```java
@Override
public void makeSounds() {
}
```

Java will complain because `makeSounds()` does not override the parent's `makeSound()`.

---

# 6. Using `super` With Overriding

This connects directly to what we learned earlier.

Suppose:

```java
class Animal {

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
```

The child overrides it:

```java
class Dog extends Animal {

    @Override
    public void makeSound() {

        super.makeSound();

        System.out.println("Dog barks");
    }
}
```

Now:

```java
Dog dog = new Dog();

dog.makeSound();
```

produces:

```text
Animal makes a sound
Dog barks
```

The line:

```java
super.makeSound();
```

calls the **parent implementation**.

Then:

```java
System.out.println("Dog barks");
```

runs the child implementation.

---

# 7. Overloading vs Overriding

This is the most important distinction.

|                      | Overloading                     | Overriding                                   |
| -------------------- | ------------------------------- | -------------------------------------------- |
| Relationship         | Usually same class              | Parent and child                             |
| Method name          | Same                            | Same                                         |
| Parameters           | Must differ                     | Must match                                   |
| Implementation       | Multiple implementations        | Child replaces/extends parent implementation |
| `@Override`          | No                              | Yes                                          |
| Inheritance required | No                              | Yes                                          |
| Main purpose         | Different ways to call a method | Change inherited behavior                    |

---

# 8. Complete Example

Here is a complete example containing both concepts:

```java
class Calculator {

    // Method overloading
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}


class Animal {

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {

    // Method overriding
    @Override
    public void makeSound() {

        super.makeSound();

        System.out.println("Dog barks");
    }
}


public class MethodOverridingOverloading {

    public static void main(String[] args) {

        System.out.println("Method Overloading and Overriding");


        // ============================================================
        // Method Overloading
        // ============================================================

        System.out.println("\nMethod Overloading");

        Calculator calculator = new Calculator();

        System.out.println(
                calculator.add(10, 20)
        );

        System.out.println(
                calculator.add(10, 20, 30)
        );

        System.out.println(
                calculator.add(10.5, 20.5)
        );


        // ============================================================
        // Method Overriding
        // ============================================================

        System.out.println("\nMethod Overriding");

        Dog dog = new Dog();

        dog.makeSound();
    }
}
```

Output:

```text
Method Overloading and Overriding

Method Overloading
30
60
31.0

Method Overriding
Animal makes a sound
Dog barks
```

---

# 9. The Mental Model

Think of **overloading** as:

```text
Same class
     │
     ├── add(int, int)
     ├── add(int, int, int)
     └── add(double, double)
```

Same operation, different inputs.

Think of **overriding** as:

```text
Animal
   │
   └── makeSound()
          │
          ▼
        Dog
          │
          └── makeSound()
```

The child changes the behavior inherited from the parent.

---

# 10. One Important Difference

Overloading is generally resolved by the compiler based on the method arguments.

For example:

```java
calculator.add(10, 20);
```

Java sees:

```text
add(int, int)
```

and selects that method.

Overriding is different.

It becomes particularly important when we use a **parent reference pointing to a child object**:

```java
Animal animal = new Dog();

animal.makeSound();
```

Even though the reference is:

```java
Animal
```

the actual object is:

```java
Dog
```

so Java calls the overridden `Dog.makeSound()`.

This is one of the foundations of **runtime polymorphism**.
