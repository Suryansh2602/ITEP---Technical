// Bank Account
// Create a class BankAccount with fields: accountNumber, holderName, balance.
// Use setters to assign values. Add a method to display balance.
class BankAccount {
    private String holderName;
    private int accountNumber, balance;


    public void setDetail(String holderName, int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;

    }

    public void display() {
        System.out.println("book's HolderName  is :" + holderName);
        System.out.println("book's accountNumber is :" + accountNumber);
        System.out.println("book's balance is :" + balance);

    }
}

class TestMain {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.setDetail("sakib", 12345, 100);
        b1.display();
    }
}