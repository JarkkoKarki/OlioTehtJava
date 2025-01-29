package LibraryUser;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int year;
    private double rating;
    private ArrayList<String> reviews;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.reviews = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating");
        }
    }

    public void setReview(String review) {
        reviews.add(review);
    }
    public double getRating() {
        return rating;
    }
    public ArrayList<String> getReviews() {
        return reviews;
    }

}
