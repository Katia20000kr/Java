package HOMEWORK4;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class CoffeeShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderStorage storage = new CsvOrderStorage();

        boolean running = true;
        while (running) {
            System.out.println("\n--- Coffee Shop Menu ---");
            System.out.println("1. Add Order");
            System.out.println("2. View orders of a date");
            System.out.println("3. View total amount of a customer");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    System.out.print("Customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Amount paid: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Date (yyyy-mm-dd): ");
                    LocalDate date = LocalDate.parse(scanner.nextLine());
                    storage.saveOrder(new Order(name, amount, date));
                    System.out.println("Order saved.");
                    break;
                case 2:
                    System.out.print("Date (yyyy-mm-dd): ");
                    LocalDate searchDate = LocalDate.parse(scanner.nextLine());
                    List<Order> orders = storage.getOrdersByDate(searchDate);
                    if (orders.isEmpty()) {
                        System.out.println("No orders found.");
                    } else {
                        for (Order o : orders) {
                            System.out.println(o.getCustomerName() + " - " + o.getAmountPaid() + "€");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Customer name: ");
                    String searchName = scanner.nextLine();
                    double total = storage.getTotalByCustomer(searchName);
                    System.out.println("Total amount: " + total + "€");
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}

