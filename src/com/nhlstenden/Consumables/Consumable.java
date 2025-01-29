package com.nhlstenden.Consumables;

import com.nhlstenden.Payable;

public abstract class Consumable implements Payable {

    private String name;
    private double price;

    public Consumable(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public int getPrice(){
        return this.getPrice();
    }
}
