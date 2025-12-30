class Mythread extends Thread {
    Task t;

    public Mythread(Task t) {
        this.t = t;
    }

    public void run() {
        t.m1();
        t.m2();
    }
}

class Task {
    synchronized public void m1() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From method m1(): " + i);
        }
    }

    synchronized public void m2() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println("From method m2(): " + i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Task t1 = new Task();
        Mythread ta = new Mythread(t1);
        Mythread tb = new Mythread(t1);
        ta.start();
        tb.start();

    }
}