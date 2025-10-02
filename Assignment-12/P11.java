//  Banking System – Insufficient Balance

// You are building a banking system. A user tries to withdraw more money than available in their account.

// Which exception would you throw?

// Will you use a checked or unchecked exception? Why?

// Write a custom exception InsufficientBalanceException
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal of " + amount);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}
// I will use checked dexception because insufficient balance is a foreseeable
// condition that a user might encounter during banking operations.

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000); // Initial balance of 1000
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        try {
            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Balance: " + account.getBalance());
            sc.close();
        }
    }
}