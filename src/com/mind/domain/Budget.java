package com.mind.domain;

public class Budget {

    private final Integer value;
    private final Integer items;

    public Budget(Integer value, Integer items) {
        this.value = value;
        this.items = items;
    }

    public Integer getValue() {
        return value;
    }

    public Integer getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Budget{" +
                "value=" + value +
                ", items=" + items +
                '}';
    }
}
