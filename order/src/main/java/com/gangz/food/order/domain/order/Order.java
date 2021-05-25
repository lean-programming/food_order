package com.gangz.food.order.domain.order;

import com.gangz.food.order.infrastructure.food.FoodId;
import com.gangz.food.order.infrastructure.user.UserId;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "[Order]")
public class Order {
    @Id
    @Embedded
    private OrderId id;
    @Embedded
    @AttributeOverrides({@AttributeOverride( name = "id", column = @Column(name = "user_id"))})
    private UserId userId;
    @OneToMany
    private List<OrderItem> items;
    private OrderStatus orderStatus;

    public Order(){
        this.orderStatus = OrderStatus.DRAFT;
        this.items = new ArrayList<>();
        this.id = OrderId.of(UUID.randomUUID().toString());
    }
    public Order(UserId userId){
        this();
        this.userId = userId;
    }
    public void addItem(FoodId foodId, int quantity) {
        this.items.add(new OrderItem(foodId,quantity));
    }

    public OrderStatus status() {
        return this.orderStatus;
    }

    public int itemCount() {
        return items.size();
    }

    public void submit() {
        this.orderStatus = OrderStatus.SUBMITTED;
    }

    public OrderId id() {
        return this.id;
    }
}
