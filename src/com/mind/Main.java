package com.mind;

import com.mind.discount.DiscountByICMS;
import com.mind.discount.DiscountByISS;
import com.mind.discount.NoDiscount;
import com.mind.domain.Budget;
import com.mind.payment.PriceCalculator;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        final var budgetOne = new Budget(2000, 8);
        final var budgetTwo = new Budget(4000, 20);

        final var priceCalculator = new PriceCalculator();

        out.println(priceCalculator.calculate(budgetOne));
        out.println(priceCalculator.calculate(budgetTwo));
    }
}
