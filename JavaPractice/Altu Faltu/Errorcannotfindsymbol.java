interface Workable {
    void doWork();
}

abstract class Employee {
    String name;
    abstract void report();
}

// Intended to implement Workable and extend Employee
class Developer extends Employee implements Workable {
    // Typo: "doWorker" instead of "doWork"
    public void doWorker() {
        System.out.println("Coding!");
    }

    // Missing implementation: report() method not defined

    // Uncommenting below will fix symbol error, but as written will cause:
    // - "cannot find symbol" for doWork()
    // - "Developer is not abstract and does not override abstract method report()"
}

 class Main {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.doWork(); // Error: cannot find symbol for doWork() - method is not implemented
    }
}
