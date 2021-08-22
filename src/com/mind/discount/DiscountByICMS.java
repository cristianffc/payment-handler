package com.mind.discount;

import com.mind.domain.Budget;

public class DiscountByICMS extends Discount {

    public DiscountByICMS(Discount discount) {
        super(discount);
    }

    @Override
    public Budget calculate(Budget budget) {
        if (budget.getItems() > 10) {
            budget = new Budget(budget.getValue() - 100, budget.getItems());
        }

        return discount.calculate(budget);
    }
}
