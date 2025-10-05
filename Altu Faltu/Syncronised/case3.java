// class Task {
//     synchronized public String m1() {
//         return "m1";

//     }

//     synchronized public String m2() {
//         return "m2";

//     }
// }

// class Mythread1 extends Thread {
//     Task t;

//     public Mythread1(Task t) {
//         this.t = t;
//     }

//     public void run() {
//         for (int i = 0; i <= 6; i++) {
//             System.out.println(t.m1());
//         }
//     }
// }

// class Mythread2 extends Thread {
//     Task t;

//     public Mythread2(Task t) {
//         this.t = t;
//     }

//     public void run() {
//         for (int i = 0; i <= 6; i++) {
//             System.out.println(t.m2());

//         }
//     }
// }

// class Main {
//     Task t = new Task();
//     Mythread t1 = new Mythread(t);
//     Mythread2 t2 = new Mythread2(t);

// }

class Task {
    synchronized public String m1() {
        return "m1";
    }

    synchronized public String m2() {
        return "m2";
    }

    public String m3() {
        return "m3";
    }
}

class MyThread1 extends Thread {
    Task t;

    public MyThread1(Task t) {
        this.t = t;
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(t.m1());
        }
    }
}

class MyThread2 extends Thread {
    Task t1;

    public MyThread2(Task t) {
        t1 = t;
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(t1.m2());
        }
    }
}

class MyThread3 extends Thread {
    Task t1;

    public MyThread3(Task t) {
        t1 = t;
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(t1.m3());
        }
    }
}

class Test {
    public static void main(String[] rgs) {
        Task task = new Task();
        MyThread1 t1 = new MyThread1(task);
        MyThread2 t2 = new MyThread2(task);
        MyThread3 t3 = new MyThread3(task);
        t1.start();
        t2.start();
        t3.start();

    }
}