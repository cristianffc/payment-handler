package com.mind.purchase.observer;

import com.mind.purchase.adapter.HttpAdapter;
import com.mind.purchase.domain.Purchase;

import java.util.Map;

import static java.lang.System.out;

public class NotifyServiceAction implements MakePurchaseAction {

    private final HttpAdapter httpAdapter;

    public NotifyServiceAction(final HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    @Override
    public void execute(Purchase purchase) {
        out.println("Notify service" + purchase);
        purchase.getBudgetableList().forEach(budgetable -> {
            httpAdapter.post("api.com", Map.of("customerName", purchase.getCustomerName(),
                    "value", budgetable.getValue()));
        });

    }
}
