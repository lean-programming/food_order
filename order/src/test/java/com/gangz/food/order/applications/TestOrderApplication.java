package com.gangz.food.order.applications;

import com.gangz.food.order.domain.order.Order;
import com.gangz.food.order.domain.order.OrderFactory;
import com.gangz.food.order.domain.order.OrderStatus;
import com.gangz.food.order.infrastructure.food.FoodId;
import com.gangz.food.order.infrastructure.user.UserId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestOrderApplication {
    OrderApplicaton orderApplicaton;
    @BeforeEach
    public void setUp(){
        orderApplicaton = new OrderApplicaton(null);
    }
    @Test
    public void createOrderShouldBeSuccess(){
        List<OrderItemDTO> selectedItems =
                Arrays.asList(OrderItemDTO.build(FoodId.of("food_1"),1),
                        OrderItemDTO.build(FoodId.of("food_2"),1));

        OrderDTO order = orderApplicaton.create(UserId.of("user_1"),
                selectedItems);
        assertEquals(OrderStatus.SUBMITTED.name(),order.getStatus());
        assertEquals(2,order.itemCount());
    }


}
