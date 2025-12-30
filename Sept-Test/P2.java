//  2. Exception Handling Problem

// Bank Withdrawal Simulation

// Create a custom exception InsufficientFundsException.

// Create a class BankAccount with fields: accountNumber, balance.

// Add a withdraw(double amount) method that:

// Throws InsufficientFundsException if the amount > balance.

// Deducts the amount otherwise.

// In main, create an account, attempt withdrawals, and handle the exception gracefully.
import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount() {
    }

    public void showBalance() {
        System.out.println("Balance  : " + this.balance);
    }

    public BankAccount(String acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    public void Withdraw(double amount) throws InsufficientFundsException {
        if (amount > this.balance) {
            throw new InsufficientFundsException("Insufficient Balance : " + this.balance);
        } else {
            this.balance = this.balance - amount;
            System.out.println("Transaction Successfull \n \t Available balance : " + this.balance);
        }
    }

}

class Main {
    public static void main(String[] args) {

        BankAccount Suryansh = new BankAccount("Suryansh", 30000);
        System.out.println("\t Enter the Amount to Withdraw");

        try (Scanner sc = new Scanner(System.in);) {
            Suryansh.Withdraw(sc.nextDouble());
        } catch (InsufficientFundsException e) {
            e.printStackTrace();

        }
    }
}