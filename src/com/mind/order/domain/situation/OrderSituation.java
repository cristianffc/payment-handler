package com.mind.order.domain.situation;

import com.mind.order.domain.Order;

public abstract class OrderSituation {

    public abstract Order next(final Order order);

    public abstract Order previous(final Order order);
}
