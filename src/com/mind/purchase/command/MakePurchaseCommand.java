package com.mind.purchase.command;

import com.mind.purchase.domain.Purchase;

import static java.lang.System.out;

public class MakePurchaseCommand extends PurchaseCommand {

    public MakePurchaseCommand(Purchase purchase) {
        super(purchase);
    }

    @Override
    public void execute() {
        out.println("Start - Make purchase command");
        out.println("Send message to database");
        out.println("Send message to service to make purchase");
        out.println("Finish - Make purchase command");
    }
}
