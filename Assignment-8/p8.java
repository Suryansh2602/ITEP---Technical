/*. Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.
 */
class Bank {
    private int accountNum;

    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void addAccount() {
        display();
        System.out.println("Account is Added !!");
    }

    public void removeAccount() {
        display();
        System.out.println("Account is removed");
    }

    public void display() {
        System.out.println("Acount : " + getAccountNum());
    }
}

class Account {
    private int acNum;
    private String holdername;
    private int balance;

    public Account(int acNum, String holdername, int balance) {
        this.acNum = acNum;
        this.holdername = holdername;
        this.balance = balance;
    }

    public void setAcNum(int acNum) {
        this.acNum = acNum;
    }

    public void setName(String holdername) {
        this.holdername = holdername;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Holder Number   : " + acNum);
        System.out.println("Holder Name : " + holdername);
        System.out.println("Account balance: " + balance);
    } 
}

class Main {
    public static void main(String[] args) {
        Bank b = new Bank(5554423);
        b.addAccount();
        Account a = new Account(23444454, "satara", 45000);
        a.displayDetails();
    }
}