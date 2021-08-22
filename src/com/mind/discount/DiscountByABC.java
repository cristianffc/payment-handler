package com.mind.discount;

import com.mind.domain.Budget;

public class DiscountByABC extends Discount {

    public DiscountByABC(Discount discount) {
        super(discount);
    }

    @Override
    public Boolean shouldApply(Budget budget) {
        return budget.getItems() > 5;
    }

    @Override
    public Budget executeCalculation(Budget budget) {
        return new Budget(budget.getValue() - 5, budget.getItems());
    }

}
