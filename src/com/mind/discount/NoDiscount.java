package com.mind.discount;

import com.mind.domain.Budget;

import static java.lang.Boolean.FALSE;

public class NoDiscount extends Discount {

    public NoDiscount() {
        super(null);
    }

    @Override
    public Boolean shouldApply(Budget budget) {
        return FALSE;
    }

    @Override
    public Budget executeCalculation(Budget budget) {
        return budget;
    }

}
