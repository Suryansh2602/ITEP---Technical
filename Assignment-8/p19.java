// 18. Write a Java program to create a class called "Restaurant" with
// attributes for menu items, prices, and ratings, and methods to add and remove
// items, and to calculate average rating.

import java.util.ArrayList;

class Restaurant {
    private ArrayList<String> items;
    private ArrayList<Double> prices;
    private ArrayList<Double> ratings;

    private static Double AvgRating = 0.0;

    public Restaurant() {
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
        this.ratings = new ArrayList<>();
    }

    public void menu(String item, double price, double rating) {
        items.add(item);
        prices.add(price);
        ratings.add(rating);
    }

    public double avgRating() {
        double sum = 0.0;
        for (Double d : ratings) {
            sum += d;
        }
        return sum / ratings.size();
    }

    public void display() {
        System.out.println("Item : " + items);
        System.out.println("Price : " + prices);
        System.out.println("Rating : " + ratings);
        System.out.println("Average Rating : " + avgRating());
    }

}

class Main {
    public static void main(String[] args) {
        Restaurant r1 = new Restaurant();
        r1.menu("Pasta", 20.5, 5);
        r1.menu("Noodle", 50.5, 4.5);
        r1.menu("Roti", 7.5, 4.5);
        r1.display();

    }
}