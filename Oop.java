// Handling of memory in Java is done by the JVM (Java Virtual Machine) and the garbage collector.
//1 Stack memory: This is where the local primitive data types (int, float, char, etc.) and references to objects are stored. The stack memory is managed by the JVM and is automatically cleaned up when a method call is completed. Each thread has its own stack memory, which is used for method calls and local variables.
//2 Heap memory: This is where the instantiation variables and objects are stored. The heap memory is managed by the garbage collector, which automatically frees up memory that is no longer being used by the program. The
class MathOperations{
    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a , int b){
        return a*b;
    }
    public double divide(int a, int b){
        if(b==0){
            System.out.println("Division by " + b + " is not allowed");
            return 0;
        }
        return (double)a/b;
    }
}
public class Oop{
    public static void main(String[] args){
        System.out.println("Object Oriented Programming in Java");
        // creating an object of MathOperations class
        MathOperations math = new MathOperations();
        int sum = math.add(10, 20);
        System.out.println("Sum: "+sum);
        int difference = math.subtract(20, 10);
        System.out.println("Difference: "+difference);
        int product = math.multiply(10, 20);
        System.out.println("Product: "+product);
        double quotient = math.divide(20, 10);
        System.out.println("Quotient: "+quotient);
    }
}