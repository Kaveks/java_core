public class DataStructures {
    public static void main(String[] args) {
        System.out.println("Data Structures and Collections in Java");
    }
}




import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DataStructures {

    public static void main(String[] args) {

        System.out.println("Data Structures and Collections in Java");

        // ============================================================
        // 1. ARRAYS
        // ============================================================

        System.out.println("\n1. Arrays");

        // Fixed-size collection
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First element: " + numbers[0]);
        System.out.println("Array length: " + numbers.length);


        // ============================================================
        // 2. LIST
        // ============================================================

        System.out.println("\n2. List");

        // Ordered collection
        // Allows duplicate elements
        List<String> names = new ArrayList<>();

        names.add("Patrick");
        names.add("John");
        names.add("Patrick");

        System.out.println("Names: " + names);
        System.out.println("First name: " + names.get(0));


        // ============================================================
        // 3. SET
        // ============================================================

        System.out.println("\n3. Set");

        // Collection of unique elements
        Set<String> uniqueNames = new HashSet<>();

        uniqueNames.add("Patrick");
        uniqueNames.add("John");
        uniqueNames.add("Patrick");

        System.out.println("Unique names: " + uniqueNames);


        // ============================================================
        // 4. MAP
        // ============================================================

        System.out.println("\n4. Map");

        // Stores key-value pairs
        Map<String, Integer> ages = new HashMap<>();

        ages.put("Patrick", 25);
        ages.put("John", 30);
        ages.put("Mary", 28);

        System.out.println("Ages: " + ages);
        System.out.println("Patrick's age: " + ages.get("Patrick"));


        // ============================================================
        // 5. QUEUE
        // ============================================================

        System.out.println("\n5. Queue");

        // Elements are processed from the front
        Queue<String> queue = new ArrayDeque<>();

        queue.add("Patrick");
        queue.add("John");
        queue.add("Mary");

        System.out.println("Queue: " + queue);
        System.out.println("First element: " + queue.peek());


        // ============================================================
        // 6. DEQUE
        // ============================================================

        System.out.println("\n6. Deque");

        // Double-ended queue
        // Elements can be added or removed from either end
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.addFirst("Patrick");
        deque.addLast("John");
        deque.addLast("Mary");

        System.out.println("Deque: " + deque);
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());


        // ============================================================
        // 7. COMMON IMPLEMENTATIONS
        // ============================================================

        System.out.println("\n7. Common Implementations");

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();

        Queue<String> priorityQueue = new PriorityQueue<>();

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);

        System.out.println("HashMap: " + hashMap);
        System.out.println("TreeMap: " + treeMap);

        System.out.println("PriorityQueue: " + priorityQueue);
    }
}
// ```

// ### The fundamentals to remember

// ```text
// Array
//     Fixed size
//     Same type of elements
//     Access using index

// List
//     Ordered
//     Allows duplicates
//     Can grow and shrink

// Set
//     Unique elements
//     Does not allow duplicates

// Map
//     Key → Value
//     Keys are unique

// Queue
//     Elements processed from the front

// Deque
//     Elements can be processed from both ends
// ```

// And one very important Java pattern appears throughout the code:

// ```java
// List<String> names = new ArrayList<>();
// ```

// The left side is the **interface**:

// ```java
// List<String>
// ```

// The right side is the **implementation**:

// ```java
// new ArrayList<>()
// ```

// We'll learn why Java does this as we go through each structure.
