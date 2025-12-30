//  Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews.

import java.util.ArrayList;

class Movie {
    private String title;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<String> reviews;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
        this.actors = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    // Add an actor
    public void addActor(String actor) {
        actors.add(actor);
    }

    // Add a review
    public void addReview(String review) {
        reviews.add(review);
    }

    // Get all reviews
    public void printReviews() {
        if (reviews.isEmpty()) {
            System.out.println("No reviews yet for \"" + title + "\".");
        } else {
            System.out.println("Reviews for \"" + title + "\":");
            for (String r : reviews) {
                System.out.println("- " + r);
            }
        }
    }

    // Display movie details
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actors: " + String.join(", ", actors));
    }
}

// Main class
 class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", "Christopher Nolan");
        movie.addActor("Leonardo DiCaprio");
        movie.addActor("Joseph Gordon-Levitt");
        movie.addActor("Elliot Page");

        movie.addReview("Mind-bending and brilliant!");
        movie.addReview("A masterpiece of science fiction.");
        movie.addReview("Complex but worth multiple viewings.");

        movie.printDetails();
        movie.printReviews();
    }
}
