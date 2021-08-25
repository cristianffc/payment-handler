package com.mind.purchase.command;

import com.mind.purchase.domain.Purchase;

import static java.lang.System.out;

public class ReviewPurchaseCommand extends PurchaseCommand {

    public ReviewPurchaseCommand(Purchase purchase) {
        super(purchase);
    }

    @Override
    public void execute() {
        out.println("Start - Review purchase command");
        out.println("Send email");
        out.println("Send message to service to review purchase");
        out.println("Finish - Review purchase command");

    }
}
