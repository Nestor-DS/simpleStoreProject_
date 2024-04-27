package com.nds.storeProject;

public class Buy implements Comparable<Buy>{
    private double value;
    private String description;

    public Buy(double value, String description) {
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
    public int compareTo(Buy otherBuy) {
        return Double.valueOf(this.value).compareTo(Double.valueOf(otherBuy.getValue()));
    }
}
