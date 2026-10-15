public class LogicalOperator {
    public static void main(String[] args) {

        System.out.println("Logical Operators in Java");

        boolean a = true;
        boolean b = false;
        int x=10;
        int y=20;
        int z=30;

        // AND (&&)
        System.out.println("a && b: " + (a && b));
        System.out.println("x<y && y<z: " + (x<y && y<z));

        // OR (||)
        System.out.println("a || b: " + (a || b));
        System.out.println("x<y || y>z: " + (x<y || y>z));

        // NOT (!)
        System.out.println("!a: " + (!a));
        System.out.println("!b: " + (!b));
        System.out.println("!x<y: " + (!(x<y)));
    }
}