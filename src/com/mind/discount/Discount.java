package com.mind.discount;

import com.mind.domain.Budget;

public abstract class Discount {

    protected final Discount discount;

    public Discount(Discount discount) {
        this.discount = discount;
    }

    public Budget calculate(Budget budget) {
        if (shouldApply(budget)) {
            budget = executeCalculation(budget);
        }

        if (discount == null) {
            return budget;
        }

        return discount.calculate(budget);
    }

    public abstract Boolean shouldApply(Budget budget);

    public abstract Budget executeCalculation(Budget budget);
}
