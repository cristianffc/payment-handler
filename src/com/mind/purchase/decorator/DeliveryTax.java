package com.mind.purchase.decorator;

public abstract class DeliveryTax {

    private final DeliveryTax otherDeliveryTax;

    public DeliveryTax(DeliveryTax otherDeliveryTax) {
        this.otherDeliveryTax = otherDeliveryTax;
    }

    public DeliveryTax getOtherDeliveryTax() {
        return otherDeliveryTax;
    }

    public Integer calculate() {
        var valueOtherTax = 0;
        if (getOtherDeliveryTax() != null) {
            valueOtherTax = getOtherDeliveryTax().tax();
        }

        return tax() + valueOtherTax;
    }

    public abstract Integer tax();
}
