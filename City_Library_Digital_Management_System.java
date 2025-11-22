import java.io.*;
import java.util.*;

class Book {
    int bookId;
    String title, author, category;
    boolean isIssued;

    Book(int id, String t, String a, String c) {
        bookId = id; title = t; author = a; category = c; isIssued = false;
    }

    void displayBookDetails() {
        System.out.println("ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Category: " + category + ", Issued: " + isIssued);
    }

    void markAsIssued() { isIssued = true; }
    void markAsReturned() { isIssued = false; }
}

class Member {
    int memberId;
    String name, email;
    List<Integer> issuedBooks = new ArrayList<>();

    Member(int id, String n, String e) {
        memberId = id; name = n; email = e;
    }

    void displayMemberDetails() {
        System.out.println("ID: " + memberId + ", Name: " + name + ", Email: " + email + ", Issued Books: " + issuedBooks);
    }

    void addIssuedBook(int bookId) {
        issuedBooks.add(bookId);
    }

    void returnIssuedBook(int bookId) {
        issuedBooks.remove(Integer.valueOf(bookId));
    }
}

class LibraryManager {
    Map<Integer, Book> books = new HashMap<>();
    Map<Integer, Member> members = new HashMap<>();
    int nextBookId = 1, nextMemberId = 1;

    void addBook(String title, String author, String category) {
        Book book = new Book(nextBookId++, title, author, category);
        books.put(book.bookId, book);
        System.out.println("Book added successfully with ID " + book.bookId);
    }

    void addMember(String name, String email) {
        Member member = new Member(nextMemberId++, name, email);
        members.put(member.memberId, member);
        System.out.println("Member added successfully with ID " + member.memberId);
    }

    void issueBook(int bookId, int memberId) {
        Book book = books.get(bookId);
        Member member = members.get(memberId);
        if (book != null && member != null && !book.isIssued) {
            book.markAsIssued();
            member.addIssuedBook(bookId);
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Cannot issue the book.");
        }
    }

    void returnBook(int bookId, int memberId) {
        Book book = books.get(bookId);
        Member member = members.get(memberId);
        if (book != null && member != null && book.isIssued) {
            book.markAsReturned();
            member.returnIssuedBook(bookId);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Cannot return the book.");
        }
    }
}

class CityLibrary {
    public static void main(String[] args) {
        LibraryManager lm = new LibraryManager();
        lm.addBook("Java Programming Mastery", "John Smith", "Programming");
        lm.addMember("Alice", "alice@example.com");

        lm.issueBook(1, 1);
        lm.returnBook(1, 1);
    }
}
