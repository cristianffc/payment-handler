package com.mind.order.discount;

import com.mind.order.domain.Order;

public class DiscountByABC extends Discount {

    public DiscountByABC(final Discount discount) {
        super(discount);
    }

    @Override
    public Boolean shouldApply(final Order order) {
        return order.getItems() > 5;
    }

    @Override
    public Order executeCalculation(final Order order) {
        return new Order(order.getValue() - 5, order.getItems(), order.getOrderSituation());
    }

}
