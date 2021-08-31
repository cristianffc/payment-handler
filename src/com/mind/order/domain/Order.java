package com.mind.order.domain;

import com.mind.order.domain.situation.OrderSituation;
import com.mind.purchase.domain.Budgetable;

public class Order implements Budgetable {

    private final Integer value;
    private final Integer items;
    private final OrderSituation orderSituation;

    public Order(final Integer value, final Integer items, final OrderSituation orderSituation) {
        this.value = value;
        this.items = items;
        this.orderSituation = orderSituation;
    }

    public Integer getValue() {
        return value;
    }

    public Integer getItems() {
        return items;
    }

    public OrderSituation getOrderSituation() {
        return orderSituation;
    }

    public Order next() {
        return orderSituation.next(this);
    }

    public Order previous() {
        return orderSituation.previous(this);
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", items=" + items +
                ", orderSituation=" + orderSituation +
                '}';
    }
}
