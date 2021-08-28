package com.mind.purchase.observer;

import com.mind.purchase.domain.Purchase;

import static java.lang.System.out;

public class NotifyServiceAction implements MakePurchaseAction {

    @Override
    public void execute(Purchase purchase) {
        out.println("Notify service" + purchase);
    }
}
