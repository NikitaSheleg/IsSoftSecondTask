package by.IsSoftTasks.data;

import by.IsSoftTasks.domain.OrderItem;

public class OrderItemData {

    public static OrderItem[] someValidOrderItem() {
        return new OrderItem[]{ new OrderItem("item 1", 1, 5),new OrderItem("item 2", 14, 34)};
    }

    public static OrderItem anyOrderItem() {
        return new OrderItem("item", 3,9);
    }
}
