package com.mind.purchase;

import com.mind.order.domain.Order;
import com.mind.order.domain.situation.OrderInDraft;
import com.mind.purchase.command.MakePurchaseCommand;
import com.mind.purchase.command.ReviewPurchaseCommand;
import com.mind.purchase.domain.Purchase;

public class MainPurchase {

    public static void main(String[] args) {
        final var orderOne = new Order(2000, 8, new OrderInDraft());
        final var purchaseOne = new Purchase("John Player", orderOne);

        final var orderTwo = new Order(400, 10, new OrderInDraft());
        final var purchaseTwo = new Purchase("Charles Watson", orderTwo);

        final var makePurchase = new MakePurchaseCommand(purchaseOne);
        final var reviewPurchase = new ReviewPurchaseCommand(purchaseTwo);

        makePurchase.execute();
        reviewPurchase.execute();
    }
}
