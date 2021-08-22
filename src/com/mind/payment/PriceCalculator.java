package com.mind.payment;

import com.mind.discount.DiscountByABC;
import com.mind.discount.DiscountByICMS;
import com.mind.discount.DiscountByISS;
import com.mind.discount.NoDiscount;
import com.mind.domain.Budget;

public class PriceCalculator {

    public Integer calculate(Budget budget) {
        final var discount = new DiscountByABC(new DiscountByISS(new DiscountByICMS(new NoDiscount())));

        return discount.calculate(budget).getValue();
    }
}
