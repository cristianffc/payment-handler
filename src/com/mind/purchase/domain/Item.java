package com.mind.purchase.domain;

public class Item implements Budgetable {

    private final Integer value;

    public Item(Integer value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
