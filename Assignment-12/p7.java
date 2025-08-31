// Problem 6: Zoo Animal Management 

// Abstract class Animal:

// name, age

// abstract methods eat(), makeSound()

// concrete method showInfo()

// Subclasses:

// Lion

// Elephant

// Parrot

// Interface Flyable with fly() method.

// Only Parrot implements Flyable.
// ------------------------------------------------------------------
interface Flyable {
    void fly();
}

abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();

    public abstract void makeSound();

    public void showInfo() {
        System.out.println("Animal: " + name + ", Age: " + age);
    }
}

class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " eats meat.");
    }

    public void makeSound() {
        System.out.println(name + " roars!");
    }
}

class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " eats grass and fruits.");
    }

    public void makeSound() {
        System.out.println(name + " trumpets!");
    }
}

class Parrot extends Animal implements Flyable {
    public Parrot(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " eats seeds and fruits.");
    }

    public void makeSound() {
        System.out.println(name + " chirps!");
    }

    public void fly() {
        System.out.println(name + " flies around the zoo.");
    }
}

class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", 5);
        Elephant elephant = new Elephant("Jumbo", 10);
        Parrot parrot = new Parrot("Mitthu", 2);

        lion.showInfo();
        lion.eat();
        lion.makeSound();

        elephant.showInfo();
        elephant.eat();
        elephant.makeSound();

        parrot.showInfo();
        parrot.eat();
        parrot.makeSound();
        parrot.fly();
    }
}
