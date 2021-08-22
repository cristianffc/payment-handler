package com.mind.discount;

import com.mind.domain.Budget;

public class DiscountByISS extends Discount {

    public DiscountByISS(Discount discount) {
        super(discount);
    }

    @Override
    public Boolean shouldApply(Budget budget) {
        return budget.getItems() > 15;
    }

    @Override
    public Budget executeCalculation(Budget budget) {
        return new Budget(budget.getValue() - 1000, budget.getItems());
    }

}
