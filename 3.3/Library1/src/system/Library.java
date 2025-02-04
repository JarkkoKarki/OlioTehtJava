
package system;

import model.Book;
import model.LibraryMember;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<Book>();
    List<LibraryMember> members = new ArrayList<LibraryMember>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Member added to library: " + member.getName());
    }

    public void removeMember(LibraryMember member) {
        members.remove(member);
        System.out.println("Member removed");
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Book removed: " + book.getTitle());
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (members.contains(member)) {
            if (books.contains(book)) {
                member.borrowBook(book);
                books.remove(book);
                System.out.println("Book Borrowed: " + book.getTitle() +" To: " + member.getName());
            }
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        if (members.contains(member)) {
            if (!books.contains(book)) {
                member.returnBook(book);
                books.add(book);
                System.out.println("Book Returned: " + book.getTitle() +" From: " + member.getName());
            }
        }
    }

    public void getMembers() {
        System.out.println("Members: ");
        for (LibraryMember member : members) {
            System.out.println(member.getName());
        }
    }

    public void getBooks() {
        System.out.println("Books: ");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}