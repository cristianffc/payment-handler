package com.mind.purchase.command;

import com.mind.purchase.domain.Purchase;

import static java.lang.System.out;

public class CancelPurchaseCommand extends PurchaseCommand {

    public CancelPurchaseCommand(Purchase purchase) {
        super(purchase);
    }

    @Override
    public void execute() {
        out.println("Start - Cancel purchase command");
        out.println("Send message to queue");
        out.println("Send message to service to cancel purchase");
        out.println("Finish - Cancel purchase command");
    }
}
