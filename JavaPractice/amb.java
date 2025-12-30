// Parent classes with same method name
class Parent1 {
    void fun() {
        System.out.println("From Parent1");
    }
}

class Parent2 {
    void fun() {
        System.out.println("From Parent2");
    }
}

// This would cause ambiguity error if uncommented

class Child extends Parent1,Parent2{  // Compile error: Multiple inheritance not allowed

    public static void main(String[] args) {
        Child c = new Child();
        c.fun(); // Ambiguity: Which fun() to call?
    }
}

class MultipleInheritanceExample {
    public static void main(String[] args) {
        // Single inheritance works fine
        class SingleChild extends Parent1 {
            void fun() { // Overrides to resolve
                System.out.println("From SingleChild");
            }
        }
        SingleChild sc = new SingleChild();
        sc.fun(); // Output: From SingleChild (no ambiguity)
    }
}
