import java.util.ArrayList;

/*
 Write a Java program to create a class called "Movie" with
 attributes for title, director, actors, and reviews, and
 methods for adding and retrieving reviews.
 */
class Movie {
    private String title;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<Review> reviews;

    public Movie(String title, String director, ArrayList<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList<Review>();
    }

    public String getTitle() {
        return this.title;
    }

    public String getDirector() {
        return this.director;
    }

    public ArrayList<String> getActors() {
        return this.actors;
    }

    public ArrayList<Review> getReviews() {
        return this.reviews;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }
}

class Review {
    private String reviewText;
    private String reviewerName;
    private double rating;

    public Review(String reviewText, String reviewerName, double rating) {
        this.reviewerName = reviewerName;
        this.reviewText = reviewText;
        this.rating = rating;
    }

    public String getReviewText() {
        return this.reviewText;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public double getRating() {
        return rating;
    }
}

public class MovieReview {
    public static void main(String[] args) {
        
        ArrayList<String> actors = new ArrayList<>();
        actors.add("Leonardo DiCaprio");
        actors.add("Kate Winslet");

        
        Movie movie = new Movie("Titanic", "James Cameron", actors);

       
        Review review1 = new Review("Amazing movie with great performances!", "John", 4.5);
        Review review2 = new Review("A masterpiece. Emotional and thrilling.", "Sarah", 5.0);

        movie.addReview(review1);
        movie.addReview(review2);

  
        System.out.println("Movie Title: " + movie.getTitle());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Actors: " + movie.getActors());

       
        System.out.println("\nReviews:");
        for (Review review : movie.getReviews()) {
            System.out.println("Reviewer: " + review.getReviewerName());
            System.out.println("Rating: " + review.getRating());
            System.out.println("Comment: " + review.getReviewText());
            System.out.println();
        }
    }
}

