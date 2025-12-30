class Underage extends Exception {
    public Underage(String msg) {
        super(msg);
    }

}

class Main {

    public static void hello() throws Underage {
        int age = 16;
        if (age < 18) {
            throw new Underage("You're underage");
        } else {
            System.out.println("You're not underage");
        }
    }

    public static void main(String[] args) {
        try {
            hello();
        } catch (Underage e) {
            e.printStackTrace();
        }
    }
}