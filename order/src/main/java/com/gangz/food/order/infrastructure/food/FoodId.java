package com.gangz.food.order.infrastructure.food;

import com.gangz.food.order.infrastructure.user.UserId;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FoodId implements Serializable {
    private final String id;

    public FoodId(String foodId) {
        this.id = foodId;
    }

    public static FoodId of(String foodId) {
        return  new FoodId(foodId);
    }

}
