package com.gangz.food.order.applications;

import com.gangz.food.order.domain.order.Order;
import com.gangz.food.order.domain.order.OrderFactory;
import com.gangz.food.order.domain.order.OrderRepository;
import com.gangz.food.order.infrastructure.user.UserId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderApplicaton {

    private final OrderRepository orderRepository;
    private final OrderFactory orderFactory;

    public OrderApplicaton(@Autowired OrderRepository orderRepository){
        orderFactory = new OrderFactory();
        this.orderRepository = orderRepository;
    }

    public OrderDTO create(UserId userId, List<OrderItemDTO> selectedItems) {
        Order order = orderFactory.create(UserId.of("user_1"),
                selectedItems);
        return OrderConvertor.toDto(order);
    }

    public OrderDTO getOrderWithId(String id) {
        return new OrderDTO();
    }
}
