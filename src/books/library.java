package books;

import java.util.Scanner;

public class library {
    public static void main(String[] args) {
        book [] books = new book[5];

        books[0] = new book("Java", "12345", 3);
        books[1] = new book("Python", "56789", 2);
        books[2] = new book("Web", "13457", 1);
        books[3] = new book("Math", "76543", 2);
        books[4] = new book("Linux", "11223", 2);

        for(book b : books) {
            System.out.println(b);
        }

        /*
        Repeat until librarian wants.
        Ask for ISBN
        if not available display message
        else ask if should be borrowed
        if y borrow
        Ask to continue y/n
         */

        Scanner scanner = new Scanner(System.in);
        String repeat = "y";

        do {
            System.out.print("Give ISBN: ");
            String isbn = scanner.next();

            for( book b : books) {
                if(isbn.equals(b.getIsbn())) {
                    if(b.isAvailable()) {
                        System.out.print("Available, borrow? y/n: ");
                        String answer = scanner.next();
                        if(answer.equals("y")) {
                            b.borrow();
                        }
                    }
                    else {
                        System.out.println("Not available");
                    }
                }
            }

            System.out.print("Continue? y/n: ");
            repeat = scanner.next();
        } while(repeat.equals("y"));


    }
}