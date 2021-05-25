package com.gangz.food.order.applications;

import com.gangz.food.order.domain.order.Order;
import com.gangz.food.order.domain.order.OrderStatus;
import com.gangz.food.order.infrastructure.food.FoodId;
import com.gangz.food.order.infrastructure.user.UserId;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOrderCreation {
    @Test
    public void createOrderShouldBeSuccess(){
        String userId = UUID.randomUUID().toString();
        Order order = new Order(UserId.of("user_1"));
        order.addItem(FoodId.of("food_1"),1);
        order.addItem(FoodId.of("food_2"),1);
        assertEquals(OrderStatus.DRAFT,order.status());
        assertEquals(2,order.itemCount());
    }
}
