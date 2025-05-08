package HOMEWORK4;

import java.time.LocalDate;
import java.util.List;

public interface OrderStorage {
    void saveOrder(Order order);
    List<Order> getOrdersByDate(LocalDate date);
    double getTotalByCustomer(String customerName);
}
