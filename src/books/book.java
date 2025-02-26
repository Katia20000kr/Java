package books;

public class book {
    private String title;
    private String isbn;
    private int copies;
    private int borrowed;

    public book(String title, String isbn, int copies) {
        this.title = title;
        this.isbn = isbn;
        this.copies = copies;
        this.borrowed = 0;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public boolean isAvailable() {
        if (this.borrowed < this.copies) {
            return true;
        }
        else {
            return false;
        }
    }

    public void borrow() {
        if (this.borrowed < this.copies) {
            this.borrowed++;
            System.out.println(this.title + " is borrowed.");
        }
        else {
            System.out.println("Not available copies of " + this.title);
        }
    }

    public String toString() {
        return this.title + " " +
                this.isbn + " copies:" + this.copies;
    }
}
