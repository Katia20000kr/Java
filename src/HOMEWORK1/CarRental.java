
package HOMEWORK1;

import java.util.Scanner;

public class CarRental {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] fleet = {
                new Car("ABC123", "Toyota Yaris", 18000),
                new Car("DEF456", "Ford Focus", 21000),
                new Car("GHI789", "Opel Corsa", 29000),
                new Car("JKL321", "Volkswagen Polo", 11500),
                new Car("MNO654", "Hyundai i20", 39000)
        };

        boolean running = true;

        while (running) {
            System.out.println("\n--- Car Rental Menu ---");
            System.out.println("1. Rent a car");
            System.out.println("2. Return a car");
            System.out.println("3. Display all cars");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter plate number to rent: ");
                    String rentPlate = scanner.nextLine();
                    boolean rented = false;
                    for (Car car : fleet) {
                        if (car.getPlateNumber().equalsIgnoreCase(rentPlate)) {
                            if (!car.isRented()) {
                                car.rentCar();
                                System.out.println("Car rented successfully!");
                            } else {
                                System.out.println("Car is already rented.");
                            }
                            rented = true;
                            break;
                        }
                    }
                    if (!rented) {
                        System.out.println("Car not found.");
                    }
                    break;

                case 2:
                    System.out.print("Enter plate number to return: ");
                    String returnPlate = scanner.nextLine();
                    boolean found = false;
                    for (Car car : fleet) {
                        if (car.getPlateNumber().equalsIgnoreCase(returnPlate)) {
                            if (car.isRented()) {
                                System.out.print("Enter new kilometer value: ");
                                int newKm = scanner.nextInt();
                                scanner.nextLine();
                                car.returnCar(newKm);
                                System.out.println("Car returned successfully!");
                            } else {
                                System.out.println("Car is not currently rented.");
                            }
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Car not found.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Fleet Information ---");
                    for (Car car : fleet) {
                        System.out.println(car);
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
