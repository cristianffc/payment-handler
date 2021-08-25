package com.mind.order;

import com.mind.order.domain.Order;
import com.mind.order.domain.situation.OrderInDraft;
import com.mind.payment.PriceCalculator;

import static java.lang.System.out;

public class MainOrder {

    public static void main(String[] args) {
        var orderOne = new Order(2000, 8, new OrderInDraft());
        var orderTwo = new Order(4000, 20, new OrderInDraft());

        final var priceCalculator = new PriceCalculator();

        out.println(priceCalculator.calculate(orderOne));
        out.println(priceCalculator.calculate(orderTwo));

        orderOne = orderOne.next();
        orderOne = orderOne.next();
        orderOne = orderOne.next();
        out.println(orderOne);

        orderTwo = orderTwo.next();
        orderTwo = orderTwo.next();
        orderTwo = orderTwo.previous();
        out.println(orderTwo);
    }
}
