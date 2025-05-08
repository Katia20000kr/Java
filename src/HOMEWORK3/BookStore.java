
package HOMEWORK3;

import java.util.ArrayList;

public class BookStore {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new PrintedBook("9780001", "The Java Way", 22.5, "A. Developer", true, 300, "TechBooks", 10));
        books.add(new PrintedBook("9780002", "Learning OOP", 18.0, "Jane Doe", false, 250, "CodePub", 4));
        books.add(new DigitalBook("9780003", "Clean Code", 12.99, "Robert C. Martin", 850));
        books.add(new Audiobook("9780004", "The Pragmatic Programmer", 15.5, "Andy Hunt", 95, "John Narrator"));

        System.out.println("📚 Book Store - All Books:");
        System.out.println("---------------------------");
        for (Book b : books) {
            b.displayInfo(); // Polymorphic call
        }
    }
}
