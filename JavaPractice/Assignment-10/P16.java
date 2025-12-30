// Create a class Person with properties (name and age) with following features.
// Default age of person should be 18.
// A person object can be initialized with name and age.
// Method to display name and age of person.

class Person {

    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
        this.age = 18;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        p1.display(); 

        Person p2 = new Person("Bob", 25);
        p2.display();
    }
}
