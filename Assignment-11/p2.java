// 🔹 Problem Set on Abstract Class, Inheritance & Interface
// Problem 1: Payment Gateway System 💳

// Create an abstract class Payment with:

// amount field

// abstract method pay()

// concrete method paymentDetails()

// Subclasses:

// CreditCardPayment

// DebitCardPayment

// UPIPayment

// Create an interface Refundable with processRefund() method.

// Only CreditCardPayment and UPIPayment should implement Refundable.

// In main class, create different payments and process refund where applicable.
// Interface for refundable payments

import java.util.Scanner;

interface Refundable {
    void processRefund();
}

abstract class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = this.amount + amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract void pay();

    public void paymentDetails() {
        System.out.println(" Amount: " + amount);
    }
}

class CreditCardPayment extends Payment implements Refundable {
    public CreditCardPayment(double amount) {
        super(amount);
    }

    private double am;

    public void pay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to withdraw: ");
        this.am = sc.nextDouble();
        setAmount(getAmount() - am);
        System.out.println("Paid " + am + " using Credit Card.");
    }

    public void processRefund() {
        System.out.println("Refund for" + am + " processed for Credit Card payment of " + getAmount() + ".");
    }
}

class DebitCardPayment extends Payment {
    public DebitCardPayment(double amount) {
        super(amount);
    }

    public void pay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Withdrawel amount: ");
        double am = sc.nextDouble();
        if (am <= getAmount()) {
            System.out.println("Paid " + getAmount() + " using Debit Card.");
            setAmount(getAmount() - am);
        } else
            System.out.println("Insuffiecient Amount");
    }
}

// UPI Payment (supports refund)
class UPIPayment extends Payment implements Refundable {
    public UPIPayment(double amount) {
        super(amount);
    }

    private double am;
    Scanner sc = new Scanner(System.in);

    public void pay() {
        am = sc.nextDouble();
        System.out.println("Enter the Withdrawel amount: ");
        if (am <= getAmount()) {
            System.out.println("Paid " + am + " from" + getAmount() + " using UPI Payment.");
            setAmount(getAmount() - am);
        } else
            System.out.println("Insuffiecient Amount");
    }

    public void processRefund() {
        am = sc.nextDouble();
        System.out.println("Refund processed for amount  UPI payment of " + am + ".");
    }
}

// Main driver class
class PaymentGatewaySystem {
    public static void main(String[] args) {
        Payment credit = new CreditCardPayment(1000.0);
        Payment debit = new DebitCardPayment(500.0);
        Payment upi = new UPIPayment(750.0);

        credit.pay();
        credit.paymentDetails();

        debit.pay();
        debit.paymentDetails();

        upi.pay();
        upi.paymentDetails();
        ((Refundable) upi).processRefund();

    }
}
