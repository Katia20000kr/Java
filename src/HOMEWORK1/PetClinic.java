
package HOMEWORK1;

import java.util.Scanner;

public class PetClinic {

    public static void main(String[] args) {
        Pet[] pets = initializePets();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give type: ");
        String type = scanner.nextLine().toLowerCase();

        int count = displayPetsOfType(pets, type);
        System.out.println("Total animals of " + type + " type: " + count);
    }

    public static Pet[] initializePets() {
        return new Pet[]{
                new Pet("dog", "Lusy"),
                new Pet("cat", "Mitsi"),
                new Pet("dog", "Jack"),
                new Pet("duck", "Donald"),
                new Pet("rabbit", "Fluffy"),
                new Pet("dog", "Luna"),
                new Pet("turtle", "Leonardo"),
                new Pet("cat", "Milo"),
                new Pet("rabbit", "Snowball"),
                new Pet("duck", "Daisy")
        };
    }

    public static int displayPetsOfType(Pet[] pets, String type) {
        int count = 0;
        for (Pet pet : pets) {
            if (pet.getSpecies().equals(type)) {
                System.out.println("- " + pet.getName());
                count++;
            }
        }
        return count;
    }
}
