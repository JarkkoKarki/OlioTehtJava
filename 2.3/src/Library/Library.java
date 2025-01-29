package Library;

import java.util.ArrayList;

public class Library {
    Book book;
    private ArrayList<Book> books = new ArrayList<>();
    public Library() {
        this.book = null;
    }
    // Add methods here
    public void addBook(Book book) {
        books.add(book);
    }
    public void displayBooks() {
        int i = 1;
        System.out.println("Library Catalog: ");
        for (Book book : books) {
            System.out.println(i + ". Title: \"" + book.getTitle() +  "\", Author \"" + book.getAuthor() + "\", Year: " + book.getYear());
            i++;
        }
    }
    public void findBooksByAuthor(String author) {
        System.out.println("\nBooks by Author \"" + author + "\":");
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Title: \"" + book.getTitle() + "\", Year: " + book.getYear());
            }
        }
    }
}