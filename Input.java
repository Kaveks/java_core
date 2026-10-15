import java.util.Scanner;
import java.util.InputMismatchException;



public class InputHandler {

    private final Scanner scanner;

    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    public String getName() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (name.isBlank()) {
            throw new IllegalArgumentException(
                "Name cannot be empty."
            );
        }

        return name;
    }

    public int getAge() {
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 0) {
            throw new IllegalArgumentException(
                "Age cannot be negative."
            );
        }

        return age;
    }

    public double getSalary() {
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        if (!Double.isFinite(salary) || salary < 0) {
            throw new IllegalArgumentException(
                "Salary must be a non-negative, finite number."
            );
        }

        return salary;
    }

    public String getCounty() {
        scanner.nextLine(); // Consume the leftover newline

        System.out.print("Enter your county: ");
        String county = scanner.nextLine();

        if (county.isBlank()) {
            throw new IllegalArgumentException(
                "County cannot be empty."
            );
        }

        return county;
    }

    public void close() {
        scanner.close();
    }
}




public class Input {

    public static void main(String[] args) {

        System.out.println("User Input in Java");

        InputHandler input = new InputHandler();

        try {
            // Collect user information
            String name = input.getName();
            int age = input.getAge();
            double salary = input.getSalary();
            String county = input.getCounty();

            // Display collected information
            System.out.println("\n--- User Information ---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: Ksh. " + salary);
            System.out.println("County: " + county);

        } catch (InputMismatchException e) {

            System.out.println(
                "Input error: Please enter the correct data type."
            );

        } catch (IllegalArgumentException e) {

            System.out.println(
                "Validation error: " + e.getMessage()
            );

        } finally {

            input.close();
           // System.out.println("Input handler closed.");
        }
    }
}
