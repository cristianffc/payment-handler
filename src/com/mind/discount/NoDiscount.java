package com.mind.discount;

import com.mind.domain.Budget;

public class NoDiscount extends Discount {

    public NoDiscount() {
        super(null);
    }

    @Override
    public Budget calculate(Budget budget) {
        return budget;
    }
}
