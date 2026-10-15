
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

@FunctionalInterface
interface ThreeNumberCalculator {
    int add(int a, int b, int c);
}

@FunctionalInterface
interface ConstantCalculator {
    int calculate();
}

public class LambdaExpressions {

    public static void main(String[] args) {

        System.out.println("Lambda Expressions in Java");

        // 1. Traditional anonymous class implementation
        Calculator calc = new Calculator() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };

        System.out.println("Anonymous class sum: " + calc.add(10, 20));
        System.out.println();

        // 2. Lambda with explicit parameter types
        Calculator calc2 = (int a, int b) -> a + b;
        System.out.println("Explicit types sum: " + calc2.add(11, 22));
        System.out.println();

        // 3. Lambda with inferred parameter types
        Calculator calc3 = (a, b) -> a + b;
        System.out.println("Inferred types sum: " + calc3.add(11, 22));
        System.out.println();

        // 4. Lambda with three parameters
        ThreeNumberCalculator calc4 = (a, b, c) -> a + b + c;
        System.out.println("Three numbers sum: " + calc4.add(11, 22, 33));
        System.out.println();

        // 5. Lambda with multiple statements
        Calculator calc5 = (a, b) -> {
            int result = a + b;
            return result;
        };
        System.out.println("Block body sum: " + calc5.add(11, 22));
        System.out.println();

        // 6. Lambda with no parameters
        ConstantCalculator calc6 = () -> 11 + 22;
        System.out.println("No-parameter result: " + calc6.calculate());
        System.out.println();

        // 7. Another block-body lambda
        Calculator calc7 = (a, b) -> {
            int result = a + b;
            return result;
        };
        System.out.println("Another block body sum: " + calc7.add(11, 22));
        System.out.println();
    }
}