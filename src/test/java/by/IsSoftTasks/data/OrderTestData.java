package by.IsSoftTasks.data;

import by.IsSoftTasks.domain.Order;
import by.IsSoftTasks.domain.OrderItem;

import java.time.LocalDate;

public class OrderTestData {

    public static Order anyValidOrder() {
        return validOrder("valid ID");
    }

    public static Order validOrder(String userId) {
        Order order = new Order(userId);
        order.setId("1");
        order.setDeliveryAddress("some address");
        order.setDateOfOrder(LocalDate.now());
        OrderItem[] items = {new OrderItem("item", 2,5)};
        order.setOrderItems(items);

        return order;
    }

    public static Order anyOrder() {
        return anyValidOrder();
    }


}
