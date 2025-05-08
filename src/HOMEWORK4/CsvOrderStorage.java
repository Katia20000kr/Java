package HOMEWORK4;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class CsvOrderStorage implements OrderStorage {
    private static final String FILE_NAME = "orders.csv";

    @Override
    public void saveOrder(Order order) {
        try (PrintWriter out = new PrintWriter(new FileWriter(FILE_NAME, true))) {
            out.println(order.toCsv());
        } catch (IOException e) {
            System.out.println("Error saving order: " + e.getMessage());
        }
    }

    @Override
    public List<Order> getOrdersByDate(LocalDate date) {
        List<Order> result = new ArrayList<>();
        for (Order order : readAll()) {
            if (order.getDate().equals(date)) {
                result.add(order);
            }
        }
        return result;
    }

    @Override
    public double getTotalByCustomer(String customerName) {
        return readAll().stream()
                .filter(o -> o.getCustomerName().equalsIgnoreCase(customerName))
                .mapToDouble(Order::getAmountPaid)
                .sum();
    }

    private List<Order> readAll() {
        List<Order> orders = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
            while (scanner.hasNextLine()) {
                orders.add(Order.fromCsv(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            // ignore if file doesn't exist yet
        }
        return orders;
    }
}

