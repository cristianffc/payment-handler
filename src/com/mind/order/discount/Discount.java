package com.mind.order.discount;

import com.mind.order.domain.Order;

public abstract class Discount {

    protected final Discount nextDiscount;

    public Discount(final Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

    public Order calculate(Order order) {

        if (shouldApply(order)) {
            return executeCalculation(order);
        }

        return nextDiscount.calculate(order);
    }

    public abstract Boolean shouldApply(final Order budget);

    public abstract Order executeCalculation(final Order budget);
}
