/**
 * Write a Java program to create a class called "Person" with a name and age
 * attribute. Create two instances of the "Person" class, set their attributes
 * using the constructor, and print their name and age.
 */
class Person {
    private String name;
    private int age;

    //construnctor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //default 
    public Person() {
        name = "XYZ";
        age = 0;
    }

    //getter
    public String getName() {
        return name;
    }

    //setter
    public int getAge() {
        return age;
    }

    public void Display() {
        System.out.println("Name of the Person is : " + getName());
        System.out.println("Age of the Person is : " + getAge());
    }
}

class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Sneha ", 21);
        Person p2 = new Person("Sakshi", 33);
        p1.Display();
        p2.Display();
    }
}
