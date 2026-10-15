
abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method: subclasses must implement it.
    public abstract void processPayment();

    // Concrete method: already implemented.
    public void displayAmount() {
        System.out.println("Payment amount: Ksh. " + amount);
    }
}

// Interface
interface Refundable {
    void refundPayment();

    // Default method: already implemented.
    default void displayRefundPolicy() {
        System.out.println("Refunds are subject to the payment policy,and available only within 30 days of purchase.");
    }
}

// A class can extend an abstract class and implement an interface.
class MpesaPayment extends Payment implements Refundable {

    public MpesaPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Mpesa payment of Ksh. " + amount);
    }

    @Override
    public void refundPayment() {
        System.out.println("Refunding Mpesa payment of Ksh. " + amount);
    }
}

public class Interfaces {
    public static void main(String[] args) {
        System.out.println("Abstract Classes and Interfaces in Java");
        System.out.println(); // Print a new line
        System.out.println(); // Print a new line

        // Create an object of the concrete subclass.
        MpesaPayment mpesa = new MpesaPayment(1300);

        // Methods inherited from the abstract class.
        mpesa.displayAmount();
        mpesa.processPayment();

        System.out.println(); // Print a new line
        System.out.println(); // Print a new line

        // Methods implemented or provided through the interface.
        mpesa.refundPayment();
        mpesa.displayRefundPolicy();
    }
}