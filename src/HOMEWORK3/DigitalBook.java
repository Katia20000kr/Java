
package HOMEWORK3;

public class DigitalBook extends Book {
    private int sizeKb;

    public DigitalBook(String isbn, String title, double price, String author, int sizeKb) {
        super(isbn, title, price, author);
        this.sizeKb = sizeKb;
    }

    @Override
    public void displayInfo() {
        System.out.println("[Digital] " + title + " by " + author);
        System.out.println("ISBN: " + isbn + ", Price: " + price + "€, Size: " + sizeKb + " KB");
        System.out.println();
    }
}
