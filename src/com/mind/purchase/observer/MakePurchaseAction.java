package com.mind.purchase.observer;

import com.mind.purchase.domain.Purchase;

public interface MakePurchaseAction {

    void execute(Purchase purchase);
}
