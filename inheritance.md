# Java Inheritance

Inheritance allows one class to **reuse and extend** the properties and methods of another class.

Java uses the keyword:

```java
extends
```

The class being inherited from is the **parent/superclass**.

The class that inherits from it is the **child/subclass**.

---

# Example 1: Basic Inheritance

Here we have a `Person` class and an `Employee` class.

An employee **is a** person, so inheritance makes sense.

```java
class Person {

    String name;

    public void introduce() {
        System.out.println("My name is " + name);
    }
}


class Employee extends Person {

    String company;

    public void work() {
        System.out.println(name + " works at " + company);
    }
}


public class Inheritance {

    public static void main(String[] args) {

        System.out.println("Inheritance in Java");

        Employee employee = new Employee();

        employee.name = "Patrick";
        employee.company = "Syndicated Payments";

        employee.introduce();
        employee.work();
    }
}
```

Output:

```text
Inheritance in Java
My name is Patrick
Patrick works at Syndicated Payments
```

## What happened?

We have:

```java
class Employee extends Person
```

This means:

```text
Person
  │
  │ extends
  ▼
Employee
```

`Employee` automatically gets access to the inherited members of `Person`.

Therefore:

```java
employee.name
```

comes from:

```java
class Person {
    String name;
}
```

And:

```java
employee.introduce();
```

comes from:

```java
class Person {
    public void introduce() {
        ...
    }
}
```

While:

```java
employee.company
employee.work()
```

belong specifically to `Employee`.

---

# Example 2: Using `this` and `super`

Now let's make the example more useful.

Suppose the parent class has a `name`, while the child class also needs to work with its own fields.

```java
class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("My name is " + name);
    }
}


class Employee extends Person {

    String company;

    public Employee(String name, String company) {

        super(name);

        this.company = company;
    }

    public void displayInformation() {

        System.out.println("Name: " + this.name);
        System.out.println("Company: " + this.company);
    }
}


public class Inheritance {

    public static void main(String[] args) {

        System.out.println("Inheritance in Java");

        Employee employee =
                new Employee("Patrick", "Syndicated Payments");

        employee.introduce();
        employee.displayInformation();
    }
}
```

Output:

```text
Inheritance in Java
My name is Patrick
Name: Patrick
Company: Syndicated Payments
```

---

# Understanding `this`

Inside `Person`:

```java
public Person(String name) {
    this.name = name;
}
```

There are two `name`s:

```java
String name
```

is the **instance variable**.

And:

```java
String name
```

in the constructor is the **parameter**.

So:

```java
this.name = name;
```

means:

```text
this.name
    ↓
the object's name

name
    ↓
the constructor parameter
```

You can think of:

```java
this
```

as:

> "this current object."

For example:

```java
this.company
```

means:

> the `company` belonging to this particular `Employee` object.

---

# Understanding `super`

This is where inheritance becomes interesting.

Our `Employee` constructor contains:

```java
super(name);
```

`super` refers to the **parent class**.

So:

```java
super(name);
```

means:

> Call the constructor of the parent class and give it `name`.

The execution is conceptually:

```text
new Employee("Patrick", "Syndicated Payments")
             │
             ▼
Employee constructor
             │
             │ super(name)
             ▼
Person constructor
             │
             │ this.name = name
             ▼
Person part of object initialized
             │
             ▼
Back to Employee constructor
             │
             │ this.company = company
             ▼
Employee part initialized
```

The resulting object contains the state inherited from `Person` plus the state defined by `Employee`:

```text
Employee object
┌─────────────────────────────┐
│ Person portion              │
│                             │
│ name = "Patrick"            │
│                             │
├─────────────────────────────┤
│ Employee portion            │
│                             │
│ company = "Syndicated..."   │
│                             │
└─────────────────────────────┘
```

---

# `this` vs `super`

This is the important distinction:

| Keyword | Refers to      |
| ------- | -------------- |
| `this`  | Current object |
| `super` | Parent class   |

For example:

```java
this.name
```

means:

> The `name` belonging to this object.

While:

```java
super(name)
```

means:

> Call the parent class constructor.

You can also use `super` to call a parent method.

For example:

```java
class Person {

    public void introduce() {
        System.out.println("I am a person");
    }
}


class Employee extends Person {

    public void introduce() {

        super.introduce();

        System.out.println("I am an employee");
    }
}
```

Then:

```java
Employee employee = new Employee();

employee.introduce();
```

produces:

```text
I am a person
I am an employee
```

Here:

```java
super.introduce();
```

explicitly calls the **parent version** of `introduce()`.

---

# The Core Mental Model

Remember these four keywords/concepts:

```text
extends
    ↓
Inheritance relationship

this
    ↓
Current object

super
    ↓
Parent class

new
    ↓
Create an object
```

For example:

```java
Employee employee =
        new Employee("Patrick", "Syndicated Payments");
```

means:

```text
new
 ↓
Create Employee object

Employee
 ↓
Object type

"Patrick", "Syndicated Payments"
 ↓
Constructor arguments
```

Then:

```java
super(name);
```

initializes the parent portion, while:

```java
this.company = company;
```

initializes the child portion.

---

# One Important Rule

When a child constructor calls a parent constructor:

```java
super(name);
```

the `super(...)` call must be the **first statement** in the constructor.

Correct:

```java
public Employee(String name, String company) {

    super(name);

    this.company = company;
}
```

Not:

```java
public Employee(String name, String company) {

    this.company = company;

    super(name); // ❌
}
```

This is because Java requires the parent portion of the object to be initialized first.

---

## The two examples give us two levels of inheritance

### Example 1

```java
class Employee extends Person
```

Focus:

- `extends`
- inherited fields
- inherited methods
- parent and child classes

### Example 2

Focus:

- constructors
- `this`
- `super(...)`
- `super.method()`
- initialization order

These are the fundamentals we need before moving into **method overriding**, which is where inheritance becomes much more powerful.
