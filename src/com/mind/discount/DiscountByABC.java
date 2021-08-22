package com.mind.discount;

import com.mind.domain.Budget;

public class DiscountByABC extends Discount {

    public DiscountByABC(Discount discount) {
        super(discount);
    }

    @Override
    public Budget calculate(Budget budget) {
        if (budget.getItems() > 5) {
            budget = new Budget(budget.getValue() - 5, budget.getItems());
        }

        return discount.calculate(budget);
    }
}
