class Mythread extends Thread {
    Task t;

    public Mythread(Task t) {
        this.t = t;
    }

    public void run() {
        t.m1();
    }
}

class Task {
    synchronized public void m1() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Frome method m1(): " + i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Task t = new Task();
        Mythread t1 = new Mythread(t);
        Mythread t2 = new Mythread(t);
        t1.start();
        t2.start();

    }
}