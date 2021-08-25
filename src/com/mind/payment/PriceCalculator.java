package com.mind.payment;

import com.mind.order.discount.DiscountByABC;
import com.mind.order.discount.DiscountByICMS;
import com.mind.order.discount.DiscountByISS;
import com.mind.order.domain.Order;

public class PriceCalculator {

    public Integer calculate(final Order order) {
        final var discount = new DiscountByABC(new DiscountByISS(new DiscountByICMS(null)));

        return discount.calculate(order).getValue();
    }

}
