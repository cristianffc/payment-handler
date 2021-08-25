package com.mind.order.discount;

import com.mind.order.domain.Order;

public class DiscountByICMS extends Discount {

    public DiscountByICMS(final Discount discount) {
        super(discount);
    }

    @Override
    public Boolean shouldApply(final Order order) {
        return order.getItems() > 10;
    }

    @Override
    public Order executeCalculation(final Order order) {
        return new Order(order.getValue() - 100, order.getItems(), order.getOrderSituation());
    }

}
