package com.mind.discount;

import com.mind.domain.Budget;

public abstract class Discount {

    protected final Discount discount;

    public Discount(Discount discount) {
        this.discount = discount;
    }

    public abstract Budget calculate(Budget budget);
}
