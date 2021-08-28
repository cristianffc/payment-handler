package com.mind.purchase.observer;

import com.mind.purchase.domain.Purchase;

import static java.lang.System.out;

public class SaveDatabaseAction implements MakePurchaseAction {

    @Override
    public void execute(Purchase purchase) {
        out.println("Save database" + purchase);
    }
}
