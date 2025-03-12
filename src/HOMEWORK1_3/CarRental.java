import java.util.Scanner;

class Car {
    private String plateNumber, model;
    private int kilometers;
    private boolean rented;

    public Car(String plateNumber, String model, int kilometers) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.kilometers = kilometers;
        this.rented = false;
    }

    public String getPlateNumber() { return plateNumber; }
    public boolean isRented() { return rented; }

    public void rentCar() {
        if (rented) System.out.println("Car is already rented.");
        else { rented = true; System.out.println("Car rented."); }
    }

    public void returnCar(int newKilometers) {
        if (!rented) System.out.println("Car is not rented.");
        else if (newKilometers >= kilometers) {
            kilometers = newKilometers; rented = false; System.out.println("Car returned.");
        } else System.out.println("Invalid kilometers.");
    }

    public void displayCar() {
        System.out.println(plateNumber + " | " + model + " | " + kilometers + " km | " + (rented ? "Rented" : "Available"));
    }
}

public class CarRental {
    private static Car[] cars = {
            new Car("ABC123", "Toyota", 5000),
            new Car("DEF456", "Honda", 69000),
            new Car("GHI789", "Ford", 72000),
            new Car("JKL012", "BMW", 8500),
            new Car("MNO345", "Audi", 91700)
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Rent a car | 2. Return a car | 3. Show cars | 4. Exit");
            switch (scanner.nextInt()) {
                case 1 -> rentCar(scanner);
                case 2 -> returnCar(scanner);
                case 3 -> displayAllCars();
                case 4 -> { scanner.close(); return; }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    private static void rentCar(Scanner scanner) {
        System.out.print("Enter plate number: ");
        String plate = scanner.next();
        for (Car car : cars) if (car.getPlateNumber().equalsIgnoreCase(plate)) { car.rentCar(); return; }
        System.out.println("Car not found.");
    }

    private static void returnCar(Scanner scanner) {
        System.out.print("Enter plate number: ");
        String plate = scanner.next();
        System.out.print("Enter new kilometers: ");
        int km = scanner.nextInt();
        for (Car car : cars) if (car.getPlateNumber().equalsIgnoreCase(plate)) { car.returnCar(km); return; }
        System.out.println("Car not found.");
    }

    private static void displayAllCars() { for (Car car : cars) car.displayCar(); }
}
