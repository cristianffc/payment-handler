package com.mind.order.discount;

import com.mind.order.domain.Order;

public class DiscountByISS extends Discount {

    public DiscountByISS(final Discount discount) {
        super(discount);
    }

    @Override
    public Boolean shouldApply(final Order order) {
        return order.getItems() > 15;
    }

    @Override
    public Order executeCalculation(final Order order) {
        return new Order(order.getValue() - 1000, order.getItems(), order.getOrderSituation());
    }

}
