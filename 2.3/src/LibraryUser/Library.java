package LibraryUser;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void displayUsers() {
        System.out.println("Users: ");
        if (users.isEmpty()) {
            System.out.println("No users found");
        } else {
            for (User user : users) {
                System.out.println(user.getName() + ", Age: " + user.getAge());
            }
        }
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + "Title: \"" + books.get(i).getTitle() + "\", Author: \"" + books.get(i).getAuthor() + "\", Year: " + books.get(i).getYear() + ", Rating: " + books.get(i).getRating() + ", " + "Reviews: " + books.get(i).getReviews());
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books by Author \"" + author + "\":");
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.getTitle() + ", Year: " + book.getYear());
            } else {
                System.out.println("No books found by " + author);
            }
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                borrowedBooks.add(book);
                System.out.println("You have borrowed: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            books.add(book);
            System.out.println("You have returned: " + book.getTitle());
        } else {
            System.out.println("This book wasn't borrowed from the library.");
        }
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public double getAverageBookRating() {
        if (books.isEmpty()) {
            return 0.0;
        }

        double totalRating = 0.0;
        int count = 0;

        for (Book book : books) {
            totalRating += book.getRating();
            count++;
        }
        return totalRating / count;
    }

    public Book getMostReviewedBook() {
        if (books.isEmpty()) {
            return null;
        }

        Book mostReviewed = books.get(0);

        for (Book book : books) {
            if (book.getReviews().size() > mostReviewed.getReviews().size()) {
                mostReviewed = book;
            }
        }
        return mostReviewed;
    }


}
