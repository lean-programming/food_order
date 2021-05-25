package com.gangz.food.order.infrastructure.user;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

@Embeddable
public class UserId implements Serializable {
    private final String id;

    public UserId(String userId) {
        this.id = userId;
    }

    public static UserId of(String userId) {
        return  new UserId(userId);
    }
}
