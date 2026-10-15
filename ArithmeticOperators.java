public class ArithmeticOperators{
    public static void main(String[] args){
         System.out.println("Arithmetic Operators in Java");
        int num1= 7;
        int num2= 3;

        // addition
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // subtraction
        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // multiplication
        int product = num1 * num2;
        System.out.println("Product: " + product);

        // division
        int quotient1 = num1 / num2;
        // to get the quotient as a double, we need to cast one of the operands to double
        double quotient2 = (double) num1 / num2;
        System.out.println("Quotient1(int): " + quotient1);
        System.out.println("Quotient2(double): " + quotient2);

        // modulus
        int remainder = num1 % num2;
        System.out.println("Remainder: " + remainder);
        // shorthand operators(+=, -=, *=, /=, %=)
        int a = 10;
        System.out.println("Initial value of a: " + a);
        a += 5; // equivalent to a = a + 5
        System.out.println("After += operation: " + a);

        // increment and decrement
        int b = 10;
        System.out.println("Initial value of b: " + b);
        b++; // increment by 1
        System.out.println("After ++ operation: " + b);
        b--; // decrement by 1
        System.out.println("After -- operation: " + b);


    }

}