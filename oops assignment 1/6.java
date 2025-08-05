// Movie Rating System
// Create a class Movie with fields: name, genre, and rating.
// Use setters and create a method isHit() that returns true if rating ≥ 8.0.
class Movie {
    private String name;
    private String genre;
    private double rating;

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isHit() {
        return rating >= 8.0;
    }

    
}
class TestMain{
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setName("The Matrix");
        movie.setGenre("Sci-Fi");
        movie.setRating(8.5);
        if (movie.isHit()) {
            System.out.println("The movie is a hit!");
        } else {
            System.out.println("The movie is not a hit.");
        }
    }
}