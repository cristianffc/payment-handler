package com.mind.purchase.command;

import com.mind.purchase.domain.Purchase;
import com.mind.purchase.observer.MakePurchaseAction;

import java.util.List;

import static java.lang.System.out;

public class MakePurchaseCommand extends PurchaseCommand {

    List<MakePurchaseAction> actionList;

    public MakePurchaseCommand(Purchase purchase, List<MakePurchaseAction> actionList) {
        super(purchase);
        this.actionList = actionList;
    }

    @Override
    public void executeCommand() {
        out.println("Start - Make purchase command");
        actionList.forEach(makePurchaseAction -> makePurchaseAction.execute(getPurchase()));
        out.println("Finish - Make purchase command");
    }
}
