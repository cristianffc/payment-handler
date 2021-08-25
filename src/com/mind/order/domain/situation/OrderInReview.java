package com.mind.order.domain.situation;

import com.mind.order.domain.Order;

public class OrderInReview extends OrderSituation {

    @Override
    public Order next(final Order order) {
        return new Order(order.getValue(), order.getItems(), new OrderApproved());
    }

    @Override
    public Order previous(final Order order) {
        return new Order(order.getValue(), order.getItems(), new OrderInDraft());
    }
}
