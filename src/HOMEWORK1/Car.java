
package HOMEWORK1;

public class Car {
    private String plateNumber;
    private String model;
    private int kilometers;
    private boolean isRented;

    public Car(String plateNumber, String model, int kilometers) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.kilometers = kilometers;
        this.isRented = false;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rentCar() {
        isRented = true;
    }

    public void returnCar(int newKm) {
        if (newKm > kilometers) {
            kilometers = newKm;
        }
        isRented = false;
    }

    @Override
    public String toString() {
        return "Plate: " + plateNumber + ", Model: " + model +
                ", Km: " + kilometers + ", Rented: " + (isRented ? "Yes" : "No");
    }
}
