package com.mind.discount;

import com.mind.domain.Budget;

public class DiscountByISS extends Discount {

    public DiscountByISS(Discount discount) {
        super(discount);
    }

    @Override
    public Budget calculate(Budget budget) {
        
        if (budget.getItems() > 15) {
            budget = new Budget(budget.getValue() - 1000, budget.getItems());
        }

        return discount.calculate(budget);
    }
}
