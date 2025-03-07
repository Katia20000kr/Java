package HOMEWORK;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        // Εκτύπωση της πρώτης γραμμής
        for (int i = 0; i < width; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Εκτύπωση των ενδιάμεσων γραμμών
        for (int i = 0; i < height - 2; i++) {
            System.out.print("*"); // Πρώτο αστεράκι
            for (int j = 0; j < width * 2 - 3; j++) {
                System.out.print(" "); // Κενά στη μέση
            }
            if (width > 1) {
                System.out.print("*"); // Τελευταίο αστεράκι
            }
            System.out.println();
        }

        // Εκτύπωση της τελευταίας γραμμής (αν height > 1)
        if (height > 1) {
            for (int i = 0; i < width; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

