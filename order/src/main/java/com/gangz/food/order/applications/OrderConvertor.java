package com.gangz.food.order.applications;

import com.gangz.food.order.domain.order.Order;

public class OrderConvertor {
    public static OrderDTO toDto(Order order) {
        OrderDTO orderDTO = new OrderDTO();
        return orderDTO.id(order.id()).status(order.status());
    }
}
