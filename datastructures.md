# Java Data Structures and Collections

Java provides several built-in ways of storing and organizing multiple values.

The main structures we will learn are:

1. Arrays
2. Lists
3. Sets
4. Maps
5. Queues
6. Deques

Java also provides many implementations of these structures through the **Java Collections Framework**.

---

## 1. Arrays

An array stores a fixed number of values of the same type.

```java
public class DataStructures {
    public static void main(String[] args) {

        System.out.println("Data Structures and Collections in Java");

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
```

Output:

```text
Data Structures and Collections in Java
10
20
30
```

### Array indexing

Java arrays use zero-based indexing:

```text
Index:     0    1    2    3    4
Value:    10   20   30   40   50
```

So:

```java
numbers[0] // 10
numbers[1] // 20
numbers[4] // 50
```

The array has a fixed size.

```java
int[] numbers = new int[5];
```

This creates an array capable of holding exactly 5 integers.

You cannot later make that same array hold 10 integers.

---

## 2. Array length

Java arrays have a `length` property.

```java
int[] numbers = {10, 20, 30, 40, 50};

System.out.println(numbers.length);
```

Output:

```text
5
```

Notice that this is:

```java
numbers.length
```

not:

```java
numbers.length()
```

`length` is a property of the array.

---

## 3. Iterating over an Array

We can use a `for` loop:

```java
int[] numbers = {10, 20, 30, 40, 50};

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

Output:

```text
10
20
30
40
50
```

Java also provides the enhanced `for` loop:

```java
for (int number : numbers) {
    System.out.println(number);
}
```

This means:

> For each `number` inside `numbers`, execute this block.

---

# 4. List

Java provides the `List` interface for an ordered collection of elements.

A common implementation is `ArrayList`.

```java
import java.util.ArrayList;
import java.util.List;

public class DataStructures {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Patrick");
        names.add("John");
        names.add("Mary");

        System.out.println(names);
    }
}
```

Output:

```text
[Patrick, John, Mary]
```

Unlike an array, an `ArrayList` can grow and shrink.

```java
names.add("David");
names.remove("John");
```

The collection changes size dynamically.

---

# 5. List Interface vs ArrayList

This is an important Java concept.

```java
List<String> names = new ArrayList<>();
```

`List` is an **interface**.

`ArrayList` is a **class that implements List**.

Think of it as:

```text
List
  ↑
  │ implements
  │
ArrayList
```

We can therefore write:

```java
List<String> names = new ArrayList<>();
```

rather than:

```java
ArrayList<String> names = new ArrayList<>();
```

The first approach is generally preferred because we program against the interface.

---

# 6. Set

A `Set` represents a collection where elements are unique.

For example:

```java
import java.util.HashSet;
import java.util.Set;

Set<String> names = new HashSet<>();

names.add("Patrick");
names.add("John");
names.add("Patrick");

System.out.println(names);
```

The second `"Patrick"` is not added because a `Set` does not allow duplicate elements.

A `HashSet` also does not guarantee normal insertion order.

Java provides other implementations when ordering matters:

```text
Set
├── HashSet
├── LinkedHashSet
└── TreeSet
```

---

# 7. Map

A `Map` stores data as **key-value pairs**.

```java
import java.util.HashMap;
import java.util.Map;

Map<String, Integer> ages = new HashMap<>();

ages.put("Patrick", 25);
ages.put("John", 30);
ages.put("Mary", 28);

System.out.println(ages);
```

Conceptually:

```text
Key       Value
----------------
Patrick     25
John        30
Mary        28
```

We can retrieve a value using its key:

```java
System.out.println(ages.get("Patrick"));
```

Output:

```text
25
```

A key identifies a value.

```java
ages.put("Patrick", 26);
```

This updates Patrick's value rather than creating another `"Patrick"` key.

Common `Map` implementations include:

```text
Map
├── HashMap
├── LinkedHashMap
└── TreeMap
```

---

# 8. Queue

Java provides the `Queue` interface for elements that are processed in a queue-like manner.

A common implementation is `ArrayDeque`.

```java
import java.util.ArrayDeque;
import java.util.Queue;

Queue<String> queue = new ArrayDeque<>();

queue.add("Patrick");
queue.add("John");
queue.add("Mary");

System.out.println(queue);
```

We can retrieve and remove the element at the front:

```java
System.out.println(queue.remove());
```

The first element added is removed first.

Conceptually:

```text
Patrick → John → Mary
   ↑
 front
```

After removing Patrick:

```text
John → Mary
```

---

# 9. Deque

`Deque` means **double-ended queue**.

It allows us to add and remove elements from both ends.

```java
import java.util.ArrayDeque;
import java.util.Deque;

Deque<String> deque = new ArrayDeque<>();

deque.addFirst("Patrick");
deque.addLast("John");
deque.addLast("Mary");

System.out.println(deque);
```

We can operate on either end:

```java
deque.removeFirst();
deque.removeLast();
```

Conceptually:

```text
      add/remove
          ↓
      ┌─────────────┐
      │ A │ B │ C │
      └─────────────┘
          ↑
      add/remove
```

`ArrayDeque` is commonly used when you need a stack-like or queue-like structure.

---

# 10. The Java Collections Framework

The structures above belong to Java's Collections Framework.

The high-level relationship looks like this:

```text
                 Collection
                     │
        ┌────────────┼────────────┐
        │            │            │
       List          Set         Queue
        │            │            │
   ArrayList      HashSet     ArrayDeque
   LinkedList     TreeSet     PriorityQueue
                  LinkedHashSet


                 Map
                  │
        ┌─────────┼─────────┐
        │         │         │
     HashMap  LinkedHashMap TreeMap
```

`Map` is part of the Collections Framework, but technically it does **not** extend the `Collection` interface.

That distinction becomes important as we go deeper into Java.

---

# 11. Generics

You will notice something like:

```java
List<String>
```

or:

```java
Map<String, Integer>
```

The values inside `< >` are called **generic type parameters**.

For example:

```java
List<String>
```

means:

> This list is intended to contain `String` objects.

And:

```java
Map<String, Integer>
```

means:

> The keys are `String` objects and the values are `Integer` objects.

For example:

```java
Map<String, Integer> ages = new HashMap<>();

ages.put("Patrick", 25);
ages.put("John", 30);
```

Here:

```text
String  → key
Integer → value
```

Java's type system can therefore catch many incorrect values at compile time.

---

# 12. Main Java Structures

The structures we will focus on are:

| Structure | Purpose                   |
| --------- | ------------------------- |
| Array     | Fixed-size collection     |
| List      | Ordered collection        |
| Set       | Unique elements           |
| Map       | Key-value associations    |
| Queue     | Queue processing          |
| Deque     | Processing from both ends |

And their common implementations:

```text
Array
    int[]

List
    ArrayList
    LinkedList

Set
    HashSet
    LinkedHashSet
    TreeSet

Map
    HashMap
    LinkedHashMap
    TreeMap

Queue / Deque
    ArrayDeque
    PriorityQueue
```

The important thing is not to memorize all of these immediately.

First understand **what each structure is designed to do**.

Later we will look at why you would choose `ArrayList` over `LinkedList`, `HashSet` over `TreeSet`, or `HashMap` over `TreeMap`.
