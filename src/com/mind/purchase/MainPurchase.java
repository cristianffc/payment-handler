package com.mind.purchase;

import com.mind.order.domain.Order;
import com.mind.order.domain.situation.OrderInDraft;
import com.mind.purchase.adapter.JavaHttpAdapter;
import com.mind.purchase.command.MakePurchaseCommand;
import com.mind.purchase.command.ReviewPurchaseCommand;
import com.mind.purchase.decorator.InternationalDeliveryTax;
import com.mind.purchase.decorator.NationalDeliveryTax;
import com.mind.purchase.domain.Budgetable;
import com.mind.purchase.domain.Item;
import com.mind.purchase.domain.Purchase;
import com.mind.purchase.observer.NotifyServiceAction;
import com.mind.purchase.observer.SaveDatabaseAction;

import java.util.ArrayList;
import java.util.Arrays;

public class MainPurchase {

    public static void main(String[] args) {
        final var orderOne = new Order(2000, 8, new OrderInDraft());
        final var listOrderOne = new ArrayList<Budgetable>();
        listOrderOne.add(orderOne);
        final var purchaseOne = new Purchase("John Player", listOrderOne);
        final var item = new Item(10000);
        final var newPurchase = purchaseOne.addBudgetable(item);
        System.out.println("newPurchase:" + newPurchase);

        final var taxes = new InternationalDeliveryTax(new NationalDeliveryTax(null));
        final var totalValueWithTax = taxes.calculate();
        System.out.println("totalValueWithTax: " + totalValueWithTax);

        final var orderTwo = new Order(400, 10, new OrderInDraft());
        final var purchaseTwo = new Purchase("Charles Darwin", Arrays.asList(orderTwo));

        final var makePurchase = new MakePurchaseCommand(purchaseOne, Arrays.asList(new NotifyServiceAction(new JavaHttpAdapter()),
                new SaveDatabaseAction()));
        final var reviewPurchase = new ReviewPurchaseCommand(purchaseTwo);

        makePurchase.executeCommand();
        reviewPurchase.executeCommand();
    }
}
