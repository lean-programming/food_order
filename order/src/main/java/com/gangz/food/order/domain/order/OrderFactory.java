package com.gangz.food.order.domain.order;

import com.gangz.food.order.applications.OrderItemDTO;
import com.gangz.food.order.infrastructure.user.UserId;

import java.util.List;

public class OrderFactory {
    public Order create(UserId userId, List<OrderItemDTO> orderItems) {
        Order order = new Order();
        orderItems.forEach(item->order.addItem(item.foodId(),item.quantity()));
        order.submit();
        return order;
    }
}
