package HOMEWORK1;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        for (int row = 0; row < height; row++) {
            if (row == 0 || row == height - 1) {
                // Top or bottom border
                for (int col = 0; col < width; col++) {
                    System.out.print("* ");
                }
            } else {
                // Middle rows with stars only at start and end
                System.out.print("* ");
                for (int col = 1; col < width - 1; col++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

