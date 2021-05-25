package com.gangz.food.order.domain.order;

import com.gangz.food.order.infrastructure.food.FoodId;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderItem {
    @Id
    @Embedded
    private FoodId foodId;
    private int quantity;

    public OrderItem(FoodId foodId, int quantity) {
        this.foodId = foodId;
        this.quantity = quantity;
    }
}
