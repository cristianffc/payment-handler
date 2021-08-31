package com.mind.purchase.domain;

import java.time.LocalDateTime;
import java.util.List;

import static java.time.LocalDateTime.now;

public class Purchase {

    private final String customerName;
    private List<Budgetable> budgetableList;
    private final LocalDateTime localDateTime;

    public Purchase(final String customerName, List<Budgetable> budgetableList) {
        this.customerName = customerName;
        this.budgetableList = budgetableList;
        this.localDateTime = now();
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Budgetable> getBudgetableList() {
        return budgetableList;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public Purchase addBudgetable(Budgetable budgetable) {
        budgetableList.add(budgetable);
        return new Purchase(customerName, budgetableList);
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "customerName='" + customerName + '\'' +
                ", budgetableList=" + budgetableList +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
