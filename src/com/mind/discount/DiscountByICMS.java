package com.mind.discount;

import com.mind.domain.Budget;

public class DiscountByICMS extends Discount {

    public DiscountByICMS(Discount discount) {
        super(discount);
    }

    @Override
    public Boolean shouldApply(Budget budget) {
        return budget.getItems() > 10;
    }

    @Override
    public Budget executeCalculation(Budget budget) {
        return new Budget(budget.getValue() - 100, budget.getItems());
    }

}
