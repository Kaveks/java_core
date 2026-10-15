
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;


class Person{
    // encapsulation
    private String name;
    private int age;
    //constructoctor
    public Person(String name, int age){
        this.name= name;
        this.age= age;
        }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

class Student{
    //encapsulation
    private String name;
    private int age;
    private String major;

    public Student(String name, int age, String major){
        this.name=name;
        this.age=age;
        this.major=major;

    }
    public String getName(){
        return name;
    }
      public int getAge(){
        return age;
    }
      public String getMajor(){
        return major;
    }



}
public class DataStructures {
    public static void main(String[] args) {
        System.out.println("Data Structures and Collections in Java");
        // ============================================================
        // 1. ARRAYS
        // ============================================================

        System.out.println("\n1. Arrays");
        System.out.println(); // Print a new line after all elements

        // Fixed-size  collection
        System.out.println("\n \n a) Fixed-size collection");
        int[] numbers= {10,20,30,40,50};
        System.out.println("First element: " + numbers[0]);
        System.out.println("Array length: " + numbers.length);
        //print all elements
        System.out.println("All elements in the array: ");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");

        }
        System.out.println(); // Print a new line after all elements
        System.out.println(); // Print a new line after all elements

        // Dynamic-size collection
        System.out.println("\n \n b) Dynamic-size collection");
        String[] str= new String[3];
        str[0]= "Hello";
        str[1]= "World";
        str[2]= "!";
        System.out.println("First element: " + str[0]);
        System.out.println("Array length: " + str.length);
        System.out.println("All elements in the array: ");
        for(int i=0;i<str.length;i++){
            System.out.print(str[i] + " ");
        }
        System.out.println(); // Print a new line after all elements
        System.out.println(); // Print a new line after all elements

        // Array of Arrays
        System.out.println("\n \n c) Array of Arrays(fixed-size collection)");
        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("First element: " + arr[0][0]);
        System.out.println("Array length: " + arr.length);
        System.out.println("All elements in the array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Print a new line after each row
        }
        System.out.println(); // Print a new line after all elements
        System.out.println(); // Print a new line after all elements

        System.out.println("\n \n d)(i) Array of Arrays(dynamic-size collection)");
        int[][] arr2= new int[3][4];
        arr2[0][0]= 10;
        arr2[0][1]= 20;
        arr2[0][2]= 30;
        arr2[0][3]= 40;
        arr2[1][0]= 50;
        arr2[1][1]= 60;
        arr2[1][2]= 70;
        arr2[1][3]= 80;
        arr2[2][0]= 90;
        arr2[2][1]= 100;
        arr2[2][2]= 110;
        arr2[2][3]= 120;
        System.out.println("First element: " + arr2[0][0]);
        System.out.println("Array length: " + arr2.length);
        System.out.println("All elements in the array: ");
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println(); // Print a new line after each row

        }

        System.out.println(); // Print a new line after all elements
        System.out.println(); // Print a new line after all elements

        //using random
        System.out.println("\n \n d)(ii) Array of Arrays(dynamic-size collection)-random-generated");
        int arr3[][]=new int[4][5];
        System.out.println("All elements in the array: ");
        for(int i=0; i< arr3.length; i++){
            for(int j=0; j<arr3[i].length;j++){
                arr3[i][j]= (int)(Math.random()*100);
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println(); // Print a new line after each row
        }
        System.out.println(); // Print a new line after all elements
        System.out.println(); // Print a new line after all elements
        System.out.println("First element: " + arr3[0][0]);
        System.out.println("Array length: " + arr3.length);

        //jagged array
        System.out.println("\n \n e) Jagged Array");
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[]{1, 2};
        jaggedArray[1] = new int[]{3, 4, 5};
        jaggedArray[2] = new int[]{6, 7, 8, 9};
        System.out.println("All elements in the jagged array: ");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // Print a new line after each row
        }
        System.out.println(); // Print a new line after all elements        
        System.out.println(); // Print a new line after all elements

        //array of objects
        System.out.println("\n \n f) Array of Objects");
        Person[] people = new Person[3];
        people[0] = new Person("Alice", 25);
        people[1] = new Person("Bob", 30);
        people[2] = new Person("Charlie", 35);
        System.out.println("All elements in the array of objects: ");
        for (int i = 0; i < people.length; i++) {
            System.out.println("Name: " + people[i].getName() + ", Age: " + people[i].getAge());
        }
        System.out.println(); // Print a new line after all elements        
        System.out.println(); // Print a new line after all elements

        Student[] students=new Student[5];
        students[0]= new Student("John", 20, "Computer Science");
        students[1]= new Student("Jane", 21, "Mathematics");
        students[2]= new Student("Mike", 22, "Physics");
        students[3]= new Student("Emily", 23, "Chemistry");
        students[4]= new Student("David", 24, "Biology");
        System.out.println("All elements in the array of objects: ");
        // for (int i=0;i<students.length; i++){
        //     System.out.println("Name: " + students[i].getName() + ", Age: " + students[i].getAge() + ", Major: " + students[i].getMajor());

        // }
        //use for in,advanced loop
        for (Student student: students){
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Major: " + student.getMajor());
        
        }
        System.out.println(); // Print a new line after all elements        
        System.out.println(); // Print a new line after all elements



        // ============================================================
        // 2. THE JAVA COLLECTIONS FRAMEWORK
        // ============================================================

        System.out.println("\n2. THE JAVA COLLECTIONS FRAMEWORK");

        // ============================================================
        // A. COLLECTION AND COLLECTIONS
        // ============================================================

        // Collection is an interface representing a group of elements.
        // It defines common operations such as add(), remove(),
        // contains(), size() and isEmpty().
        //
        // Collections is a utility class that provides algorithms
        // such as sort(), reverse(), min() and max().
        //
        // The Java Collections Framework includes interfaces,
        // implementations and algorithms for working with groups
        // of objects. Map belongs to this framework but does not
        // extend the Collection interface.

        System.out.println("\nA. Collection and Collections");

        Collection<String> names = new ArrayList<String>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Names: " + names);
        System.out.println("Number of names: " + names.size());
        System.out.println("Contains Bob: " + names.contains("Bob"));

        names.remove("Bob");
        System.out.println("After removing Bob: " + names);

        List<Integer> values = new ArrayList<>();
        values.add(40);
        values.add(10);
        values.add(30);
        values.add(20);

        System.out.println("Original values: " + values);

        Collections.sort(values);
        System.out.println("Sorted values: " + values);

        Collections.reverse(values);
        System.out.println("Reversed values: " + values);

        System.out.println("Minimum: " + Collections.min(values));
        System.out.println("Maximum: " + Collections.max(values));


        // ============================================================
        // B. ARRAYLIST
        // ============================================================

        // ArrayList is a resizable-array implementation of List.
        //
        // Characteristics:
        // 1. Preserves insertion order.
        // 2. Allows duplicate elements.
        // 3. Allows null elements.
        // 4. Supports index-based access using get(index).
        // 5. Provides fast index-based access.
        // 6. Inserting or removing elements in the middle may require
        //    shifting subsequent elements.
        //
        // Use ArrayList when you need an ordered, resizable list and
        // frequently access elements by their index.

        System.out.println("\nB. ArrayList");

        ArrayList<String> programmingLanguages = new ArrayList<>();

        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("Java"); // Duplicates are allowed

        System.out.println("Languages: " + programmingLanguages);
        System.out.println("First language: " + programmingLanguages.get(0));

        // Update an element at a specified index.
        programmingLanguages.set(1, "Kotlin");
        System.out.println("After updating: " + programmingLanguages);

        // Remove an element by index.
        programmingLanguages.remove(2);
        System.out.println("After removing index 2: " + programmingLanguages);

        System.out.println("List size: " + programmingLanguages.size());

        System.out.println("Iterating through ArrayList:");

        for (String language : programmingLanguages) {
            System.out.println(language);
        }


        // ============================================================
        // C. LINKEDLIST
        // ============================================================

        // LinkedList is implemented as a doubly linked list.
        //
        // Each node stores an element and links to the previous
        // and next nodes.
        //
        // Characteristics:
        // 1. Preserves insertion order when used as a List.
        // 2. Allows duplicates and null elements.
        // 3. Supports index-based operations, but accessing an index
        //    requires traversing the linked nodes.
        // 4. Can insert or remove elements efficiently at known
        //    positions in the linked structure.
        // 5. Does not provide constant-time random access.
        //
        // LinkedList implements both List and Deque.
        // This means it can behave as a list, queue or double-ended
        // queue. ArrayList is generally preferable for frequent
        // index-based access.

        System.out.println("\nC. LinkedList");

        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Study Java");
        tasks.add("Practice OOP");
        tasks.add("Learn Collections");

        System.out.println("Tasks: " + tasks);
        System.out.println("First task: " + tasks.get(0));

        // LinkedList-specific operations.
        tasks.addFirst("Install JDK");
        tasks.addLast("Build a project");

        System.out.println("After adding at both ends: " + tasks);

        tasks.removeFirst();
        tasks.removeLast();

        System.out.println("After removing both ends: " + tasks);


        // ============================================================
        // D. QUEUE
        // ============================================================

        // Queue is an interface for holding elements before processing.
        //
        // A typical Queue follows FIFO:
        // First In, First Out.
        //
        // The first element added is normally the first one removed.
        //
        // Important Queue methods:
        // offer(element): adds an element; returns false if insertion
        //                 fails.
        // poll(): removes and returns the head, or null if empty.
        // peek(): returns the head without removing it, or null
        //         if empty.
        //
        // Queue implementations may use different ordering rules.
        // ArrayDeque is a suitable general-purpose queue implementation.

        System.out.println("\nD. Queue");

        Queue<String> customers = new ArrayDeque<>();

        customers.offer("Customer A");
        customers.offer("Customer B");
        customers.offer("Customer C");

        System.out.println("Queue: " + customers);
        System.out.println("Next customer: " + customers.peek());

        // Process the first customer.
        System.out.println("Processing: " + customers.poll());

        System.out.println("Queue after processing: " + customers);
        System.out.println("Next customer: " + customers.peek());


        // ============================================================
        // E. DEQUE (DOUBLE-ENDED QUEUE)
        // ============================================================

        // Deque is pronounced "deck".
        // It stands for Double-Ended Queue.
        //
        // It allows elements to be inserted and removed at both ends.
        //
        // Important methods:
        // addFirst() / offerFirst(): insert at the front.
        // addLast()  / offerLast():  insert at the back.
        // pollFirst() / pollLast():  remove and return an end element.
        // peekFirst() / peekLast():  inspect an end element.
        //
        // ArrayDeque is a resizable-array implementation of Deque.
        // It does not allow null elements.
        //
        // A Deque can be used as a FIFO queue or a LIFO stack.

        System.out.println("\nE. Deque");

        Deque<String> deque = new ArrayDeque<>();

        deque.offerFirst("Front");
        deque.offerLast("Middle");
        deque.offerLast("Back");

        System.out.println("Deque: " + deque);
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        System.out.println("Removed from front: " + deque.pollFirst());
        System.out.println("Removed from back: " + deque.pollLast());

        System.out.println("Remaining deque: " + deque);


        // ============================================================
        // F. SET
        // ============================================================

        // Set is an interface representing a collection of unique
        // elements.
        //
        // Unlike List, a Set does not allow duplicate elements.
        //
        // Adding an element that already exists does not create
        // another occurrence.
        //
        // Set does not guarantee a particular iteration order.
        // That behavior depends on the implementation.

        System.out.println("\nF. Set");

        Set<String> countries = new HashSet<>();

        countries.add("Kenya");
        countries.add("Uganda");
        countries.add("Tanzania");
        countries.add("Kenya"); // Duplicate is ignored

        System.out.println("Countries: " + countries);
        System.out.println("Number of unique countries: " + countries.size());
        System.out.println("Contains Uganda: " + countries.contains("Uganda"));

        countries.remove("Tanzania");
        System.out.println("After removal: " + countries);


        // ============================================================
        // G. HASHSET
        // ============================================================

        // HashSet is an implementation of Set.
        //
        // It uses hashing to manage unique elements.
        //
        // Characteristics:
        // 1. Does not allow duplicate elements.
        // 2. Does not guarantee iteration order.
        // 3. Usually provides efficient add, remove and contains
        //    operations.
        // 4. Allows one null element.
        //
        // Use HashSet when uniqueness and efficient membership
        // checking matter more than preserving insertion order.

        System.out.println("\nG. HashSet");

        HashSet<Integer> uniqueNumbers = new HashSet<>();

        uniqueNumbers.add(10);
        uniqueNumbers.add(20);
        uniqueNumbers.add(30);
        uniqueNumbers.add(10);

        System.out.println("Unique numbers: " + uniqueNumbers);
        System.out.println("Number of unique values: " + uniqueNumbers.size());
        System.out.println("Contains 20: " + uniqueNumbers.contains(20));


        // ============================================================
        // H. LINKEDHASHSET
        // ============================================================

        // LinkedHashSet is an implementation of Set that preserves
        // insertion order during iteration.
        //
        // It combines hash-based membership checking with a linked
        // structure that maintains encounter order.
        //
        // Characteristics:
        // 1. Does not allow duplicates.
        // 2. Preserves insertion order.
        // 3. Allows one null element.
        // 4. Usually offers efficient add, remove and contains
        //    operations.
        //
        // Use LinkedHashSet when you need unique elements and want
        // to remember the order in which they were inserted.

        System.out.println("\nH. LinkedHashSet");

        LinkedHashSet<String> uniqueLanguages = new LinkedHashSet<>();

        uniqueLanguages.add("Java");
        uniqueLanguages.add("Python");
        uniqueLanguages.add("C++");
        uniqueLanguages.add("Java"); // Duplicate is ignored

        System.out.println("Languages: " + uniqueLanguages);

        uniqueLanguages.add("JavaScript");

        System.out.println("After adding JavaScript: " + uniqueLanguages);
        System.out.println("Number of unique languages: " + uniqueLanguages.size());


        // ============================================================
        // I. MAP
        // ============================================================

        // Map is an interface that stores key-value pairs.
        //
        // Each key must be unique. Values do not have to be unique.
        //
        // Unlike List, Map elements are accessed using keys rather
        // than numerical indexes.
        //
        // Important methods:
        // put(key, value): add or replace a mapping.
        // get(key): retrieve the value associated with a key.
        // containsKey(key): check whether a key exists.
        // remove(key): remove a mapping.
        // keySet(): obtain the set of keys.
        // values(): obtain the collection of values.
        // entrySet(): obtain the key-value entries.
        //
        // Map is part of the Java Collections Framework, but it does
        // not extend Collection.

        System.out.println("\nI. Map");

        Map<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 78);

        System.out.println("Student marks: " + studentMarks);
        System.out.println("Alice's marks: " + studentMarks.get("Alice"));

        System.out.println(
            "Does Bob exist? " + studentMarks.containsKey("Bob")
        );

        // A repeated key replaces its previous value.
        studentMarks.put("Alice", 90);

        System.out.println("Alice's updated marks: " + studentMarks.get("Alice"));

        System.out.println("All student entries:");

        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(
                "Name: " + entry.getKey()
                + ", Marks: " + entry.getValue()
            );
        }

        studentMarks.remove("Charlie");

        System.out.println("After removing Charlie: " + studentMarks);


        // ============================================================
        // J. HASHMAP
        // ============================================================

        // HashMap is a general-purpose implementation of Map.
        //
        // Characteristics:
        // 1. Keys are unique.
        // 2. Values may be duplicated.
        // 3. Does not guarantee iteration order.
        // 4. Allows one null key and null values.
        // 5. Usually provides efficient key-based access.
        //
        // Use HashMap when you need to retrieve values using keys
        // and do not require a particular iteration order.

        System.out.println("\nJ. HashMap");

        HashMap<String, String> employeeDepartments = new HashMap<>();

        employeeDepartments.put("EMP001", "Engineering");
        employeeDepartments.put("EMP002", "Finance");
        employeeDepartments.put("EMP003", "Human Resources");

        System.out.println("Employee departments: " + employeeDepartments);

        System.out.println(
            "EMP002 department: " + employeeDepartments.get("EMP002")
        );

        employeeDepartments.put("EMP002", "Technology");

        System.out.println(
            "Updated EMP002 department: " + employeeDepartments.get("EMP002")
        );


        // ============================================================
        // K. LINKEDHASHMAP
        // ============================================================

        // LinkedHashMap is a Map implementation that preserves
        // insertion order by default.
        //
        // Characteristics:
        // 1. Keys are unique.
        // 2. Values may be duplicated.
        // 3. Iteration normally follows insertion order.
        // 4. Allows one null key and null values.
        //
        // Use LinkedHashMap when key-value lookup is needed and
        // predictable insertion-order iteration is also important.

        System.out.println("\nK. LinkedHashMap");

        LinkedHashMap<String, String> accountTypes = new LinkedHashMap<>();

        accountTypes.put("ACC001", "Savings");
        accountTypes.put("ACC002", "Current");
        accountTypes.put("ACC003", "Fixed Deposit");

        accountTypes.put("ACC001", "Premium Savings");

        System.out.println("Account types: " + accountTypes);

        System.out.println("Accounts in insertion order:");

        for (Map.Entry<String, String> entry : accountTypes.entrySet()) {
            System.out.println(
                entry.getKey() + " -> " + entry.getValue()
            );
        }


        // ============================================================
        // END OF JAVA COLLECTIONS FRAMEWORK
        // ============================================================

       

    }
}