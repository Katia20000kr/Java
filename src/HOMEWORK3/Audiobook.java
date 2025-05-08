
package HOMEWORK3;

public class Audiobook extends Book {
    private int durationMinutes;
    private String narrator;

    public Audiobook(String isbn, String title, double price, String author, int durationMinutes, String narrator) {
        super(isbn, title, price, author);
        this.durationMinutes = durationMinutes;
        this.narrator = narrator;
    }

    @Override
    public void displayInfo() {
        System.out.println("[Audiobook] " + title + " by " + author);
        System.out.println("ISBN: " + isbn + ", Price: " + price + "€, Duration: " + durationMinutes + " min");
        System.out.println("Narrated by: " + narrator);
        System.out.println();
    }
}
