package com.gangz.food.order.applications;

import com.gangz.food.order.infrastructure.food.FoodId;
import com.gangz.food.order.infrastructure.user.UserId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class OrderApplicationSpringTest {
    @Autowired
    OrderApplicaton orderApplicaton;

    @Test
    public void createOrderShouldBePersistent(){
        List<OrderItemDTO> selectedItems =
                Arrays.asList(OrderItemDTO.build(FoodId.of("food_1"),1),
                        OrderItemDTO.build(FoodId.of("food_2"),1));

        OrderDTO order = orderApplicaton.create(UserId.of("user_1"),
                selectedItems);

        OrderDTO orderRetrieved = orderApplicaton.getOrderWithId(order.getId());
        assertNotNull(orderRetrieved);
    }


}
