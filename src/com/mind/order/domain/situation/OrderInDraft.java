package com.mind.order.domain.situation;

import com.mind.order.domain.Order;

public class OrderInDraft extends OrderSituation {

    @Override
    public Order next(final Order order) {
        return new Order(order.getValue(), order.getItems(), new OrderInReview());
    }

    @Override
    public Order previous(final Order order) {
        return order;
    }
}
