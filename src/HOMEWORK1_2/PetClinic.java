package HOMEWORK1_2;

import java.util.Scanner;

class Pet {
    String specie;
    String name;

    public Pet(String specie, String name) {
        this.specie = specie;
        this.name = name;
    }
}

public class PetClinic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pet[] pets = new Pet[10];
        pets[0] = new Pet("dog", "Pluto");
        pets[1] = new Pet("cat", "Whiskers");
        pets[2] = new Pet("dog", "Jack");
        pets[3] = new Pet("rabbit", "Bunny");
        pets[4] = new Pet("dog", "Milou");
        pets[5] = new Pet("turtle", "Speedy");
        pets[6] = new Pet("duck", "Donald");
        pets[7] = new Pet("cat", "Luna");
        pets[8] = new Pet("rabbit", "Thumper");
        pets[9] = new Pet("duck", "Daffy");

        System.out.print("Give type: ");
        String type = scanner.nextLine().toLowerCase();

        int count = 0;
        System.out.println("Pets of type " + type + ":");

        for (Pet pet : pets) {
            if (pet.specie.equalsIgnoreCase(type)) {
                System.out.println("- " + pet.name);
                count++;
            }
        }

        System.out.println("Total animals of " + type + " type: " + count);

        scanner.close();
    }
}
