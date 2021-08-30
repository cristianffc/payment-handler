package com.mind.purchase.decorator;

public class InternationalDeliveryTax extends DeliveryTax {

    public InternationalDeliveryTax(DeliveryTax otherDeliveryTax) {
        super(otherDeliveryTax);
    }

    @Override
    public Integer tax() {
        return 500;
    }
}
