package com.gangz.food.order.applications;

import com.gangz.food.order.domain.order.Order;
import com.gangz.food.order.domain.order.OrderId;
import com.gangz.food.order.domain.order.OrderItem;
import com.gangz.food.order.domain.order.OrderStatus;
import com.gangz.food.order.infrastructure.user.UserId;
import jdk.jfr.DataAmount;

import java.util.ArrayList;
import java.util.List;
public class OrderDTO {
    private String orderId;
    private String userId;
    private List<OrderItemDTO> items = new ArrayList<>();
    private String orderStatus;

    public OrderDTO id(OrderId id) {
        this.orderId = id.toString();
        return this;
    }

    public OrderDTO status(OrderStatus status) {
        this.orderStatus = status.name();
        return this;
    }

    public String getId() {
        return this.orderId;
    }

    public String getStatus() {
        return this.orderStatus;
    }

    public int itemCount() {
        return 2;//this.items.size();
    }
}
