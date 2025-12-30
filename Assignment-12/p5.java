// Problem 4: Banking System 

// Abstract class BankAccount:
// accountNumber, balance fields
// abstract methods: deposit(), withdraw()
// concrete method showBalance()

// Subclasses:

// SavingsAccount (cannot withdraw below ₹1000)
// CurrentAccount (no min balance required)
// Interface LoanEligible with method checkLoanEligibility().
// Only SavingsAccount is loan eligible.
interface LoanEligible {
    void loanEligible();
}

abstract class BankAccount implements LoanEligible {
    private String accountNumber;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println(
                " Account is created with Account Number :" + accountNumber + "\n and Initial amount :" + balance);
    }

    public void showBalance() {
        System.out.println("Account no. : " + accountNumber + "Current Balance is : " + balance);
    }

    public abstract void Deposit(double amount);

    public abstract void Withdraw(double amount);

}

class SavingsAccount extends BankAccount implements LoanEligible {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void Deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Amount deposited Successfully");
        showBalance();
    }

    public void Withdraw(double amount) {
        if (amount <= getBalance() && getBalance() >= 1000) {
            setBalance(getBalance() - amount);
            System.out.println("Amount Withdrawal Successfully");
            showBalance();
        } else {
            System.out.println("Insufficient Balance");
            showBalance();
        }
    }

    @Override
    public void loanEligible() {
        System.out.println("You're Eligible for loan");
    }
}

class CurrentAccount extends BankAccount implements LoanEligible {

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void Withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Amount Withdrawal Successfully");
            showBalance();
        } else {
            System.out.println("Insufficient Balance");
            showBalance();
        }
    }

    public void Deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Amount deposited Successfully");
        showBalance();
    }

    @Override
    public void loanEligible() {
        System.out.println("Not eligible for loan");
    }

}

class Main {
    public static void main(String[] args) {
        BankAccount Suryansh = new SavingsAccount("6166101000675", 25000);

        Suryansh.Deposit(967);
        Suryansh.Withdraw(311.56);
        Suryansh.showBalance();
        Suryansh.loanEligible();

    }
}