import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {
    public static void main(String[] args) {
        // Create instances of Library, Book, LibraryMember
        // Add books and members to the library
        // Perform borrowing and returning operations

        Library library = new Library();
        Book book1 = new Book("Book1", "Mat", "AAA");
        Book book2 = new Book("Book2", "Michael", "BBB");
        Book book3 = new Book("Book3", "Thomas", "CCC");
        LibraryMember member1 = new LibraryMember("Joseph", 1);
        LibraryMember member2 = new LibraryMember("Jane", 2);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addMember(member1);
        library.addMember(member2);
        library.borrowBook(member1, book1);
        library.borrowBook(member2, book2);
        // Palautetaan kirjat
        library.returnBook(member1, book1);
        library.returnBook(member2, book2);
        library.getMembers();

        System.out.println();
        library.reserveBook(member1, book1);
        library.reserveBook(member2, book2);
        library.displayReservedBooks(member1);
        library.displayReservedBooks(member2);
        library.cancelReservation(member1, book1);
        library.cancelReservation(member2, book2);
        library.displayReservedBooks(member1);
        library.displayReservedBooks(member2);
        System.out.println();

        library.removeMember(member1);
        library.removeMember(member2);
        library.getMembers();
        library.getBooks();
        library.removeBook(book1);
        library.removeBook(book2);
        library.removeBook(book3);
        library.getBooks();

    }
}