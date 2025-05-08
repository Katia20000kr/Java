
package HOMEWORK3;

public class PrintedBook extends Book {
    private boolean hardcover;
    private int pages;
    private String publisher;
    private int availableCopies;

    public PrintedBook(String isbn, String title, double price, String author,
                       boolean hardcover, int pages, String publisher, int availableCopies) {
        super(isbn, title, price, author);
        this.hardcover = hardcover;
        this.pages = pages;
        this.publisher = publisher;
        this.availableCopies = availableCopies;
    }

    @Override
    public void displayInfo() {
        System.out.println("[Printed] " + title + " by " + author);
        System.out.println("ISBN: " + isbn + ", Price: " + price + "€");
        System.out.println("Publisher: " + publisher + ", Pages: " + pages +
                ", Hardcover: " + hardcover + ", Available: " + availableCopies);
        System.out.println();
    }
}
