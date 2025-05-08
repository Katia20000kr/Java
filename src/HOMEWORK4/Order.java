package HOMEWORK4;

import java.time.LocalDate;

public class Order {
    private String customerName;
    private double amountPaid;
    private LocalDate date;

    public Order(String customerName, double amountPaid, LocalDate date) {
        this.customerName = customerName;
        this.amountPaid = amountPaid;
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public LocalDate getDate() {
        return date;
    }

    public String toCsv() {
        return customerName + "," + amountPaid + "," + date;
    }

    public static Order fromCsv(String line) {
        String[] parts = line.split(",");
        return new Order(parts[0], Double.parseDouble(parts[1]), LocalDate.parse(parts[2]));
    }
}

