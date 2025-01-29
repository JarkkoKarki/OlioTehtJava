package BookAvailability;

public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);
        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();
        System.out.println("Is book \"Data Structures and Algorithms\" Available? " + library.isBookAvailable("Data Structures and Algorithms"));
        library.borrowBook("Data Structures and Algorithms");

        library.displayBooks();
        System.out.println("Is book \"Data Structures and Algorithms\" Available? " + library.isBookAvailable("Data Structures and Algorithms"));
        library.returnBook(book2);
        library.displayBooks();
    }
}
