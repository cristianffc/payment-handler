package com.mind.purchase.decorator;

public class NationalDeliveryTax extends DeliveryTax {

    public NationalDeliveryTax(DeliveryTax otherDeliveryTax) {
        super(otherDeliveryTax);
    }

    @Override
    public Integer tax() {
        return 100;
    }
}
