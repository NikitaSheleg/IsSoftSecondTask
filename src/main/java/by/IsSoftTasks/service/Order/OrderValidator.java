package by.IsSoftTasks.service.Order;

import by.IsSoftTasks.domain.Order;

public class OrderValidator {

    public boolean validateForCreation(Order order) {
        return order.getDateOfOrder() != null
                && order.getOrderItems() != null
                && order.getDeliveryAddress() != null
                && order.getUserId() != null;
    }
}
