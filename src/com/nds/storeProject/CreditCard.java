package com.nds.storeProject;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;
    private List<PurchaseManager>shoppingList;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.shoppingList = new ArrayList<>();
    }

    public boolean launchBuy(PurchaseManager purchaseManager){
        if(this.balance > purchaseManager.getValue()){
            this.balance -= purchaseManager.getValue();
            this.shoppingList.add(purchaseManager);
            return true;
        } else {
            return false;
        }
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<PurchaseManager> getShoppingList() {
        return shoppingList;
    }
}
