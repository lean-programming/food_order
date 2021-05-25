package com.gangz.food.order.applications;

import com.gangz.food.order.infrastructure.food.FoodId;

public class OrderItemDTO {
    private FoodId foodId;
    private int quantity;

    public OrderItemDTO(FoodId foodId, int quantity) {
        this.foodId = foodId;
        this.quantity  = quantity;
    }

    public static OrderItemDTO build(FoodId foodId, int quantity) {
        return new OrderItemDTO(foodId,quantity);
    }

    public int quantity() {
        return this.quantity;
    }

    public FoodId foodId() {
        return this.foodId;
    }
}
