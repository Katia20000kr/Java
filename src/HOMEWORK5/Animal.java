package HOMEWORK5;

public class Animal {
    private String name;
    private String imagePath;

    public Animal(String name, String imagePath) {
        this.name = name;
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public char getFirstLetter() {
        return Character.toUpperCase(name.charAt(0));
    }
}

