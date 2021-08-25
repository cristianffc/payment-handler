package com.mind.purchase.domain;

import com.mind.order.domain.Order;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

public class Purchase {

    private final String customerName;
    private final Order order;
    private final LocalDateTime localDateTime;

    public Purchase(final String customerName, final Order order) {
        this.customerName = customerName;
        this.order = order;
        this.localDateTime = now();
    }

    public String getCustomerName() {
        return customerName;
    }

    public Order getOrder() {
        return order;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "customerName='" + customerName + '\'' +
                ", order=" + order +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
