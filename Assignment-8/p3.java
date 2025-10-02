/**
 * Write a Java program to create a class called "Dog" with a name and breed
 * attribute. Create two instances of the "Dog" class, set their attributes
 * using the constructor and modify the attributes using the setter methods and
 * print the updated values.
 */

class Dog {
    private String name;
    private String breed;

    //construnctor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    //construnctor
    public Dog() {
        name = "Kutta";
        breed = "Janwar";
    }

    //SETTER
    public void setName(String name) {
        this.name = name;
    }

    //setter
    public void setBreed(String breed) {
        this.breed = breed;
    }

    //getter name
    public String getName() {
        return name;
    }

    //getter breed
    public String getBreed() {
        return breed;
    }

    //display
    public void Display() {
        System.out.println("The name of the dog is : " + getName());
        System.out.println("The breed of the dog is : " + getBreed());
    }
 }

 class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Tommy", "German Shephard");
        d1.setName("Raja");
        d1.Display();
    }
 }