// ATM PIN Validation

// If the user enters a wrong PIN 3 times, throw a custom exception AccountLockedException.

// Which exception handling mechanism will you use?

// Should it be checked (force the programmer to handle) or unchecked?

// Custom checked exception for account lock
// Custom checked exception
import java.util.Scanner;

// Custom checked exception
class AccountLockedException extends Exception {
    public AccountLockedException(String message) {
        super(message);
    }
}

class ATMPinUserInput {
    public static void main(String[] args) {
        final int CORRECT_PIN = 1234;
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            while (attempts < 3) {
                System.out.print("Enter your PIN: ");
                int enteredPin = scanner.nextInt();

                if (enteredPin == CORRECT_PIN) {
                    System.out.println("PIN correct. Access granted.");
                    return;
                } else {
                    attempts++;
                    System.out.println("Incorrect PIN. Attempt " + attempts);
                }
            }
            throw new AccountLockedException("Account locked after 3 invalid PIN attempts.");
        } catch (AccountLockedException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

        System.out.println("Program continues...");
    }
}
