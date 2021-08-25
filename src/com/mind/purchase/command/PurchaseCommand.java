package com.mind.purchase.command;

import com.mind.purchase.domain.Purchase;

import static java.lang.System.out;

public abstract class PurchaseCommand {

    private Purchase purchase;

    public PurchaseCommand(Purchase purchase) {
        this.purchase = purchase;
    }

    public void printPurchase() {
        out.println(purchase);
    }

    public abstract void execute();

}
