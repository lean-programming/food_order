package com.gangz.food.order.domain.order;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderId implements Serializable {
    private final String id;

    public OrderId(String orderId) {
        this.id = orderId;
    }

    public static OrderId of(String orderId) {
        return new OrderId(orderId);
    }
}
