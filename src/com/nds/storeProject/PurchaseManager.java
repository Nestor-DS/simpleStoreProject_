package com.nds.storeProject;

public class PurchaseManager implements Comparable<PurchaseManager>{
    private double value;
    private String description;

    public PurchaseManager(double value, String description) {
        this.value = value;
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "com.nds.storeProject.Buy:" +
                "value=" + value +
                ", description='" + description;
    }

    @Override
    public int compareTo(PurchaseManager otherPurchaseManager) {
        return Double.valueOf(this.value).compareTo(Double.valueOf(otherPurchaseManager.getValue()));
    }
}
